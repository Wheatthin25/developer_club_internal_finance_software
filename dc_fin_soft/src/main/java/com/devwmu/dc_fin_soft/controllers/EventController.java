package com.devwmu.dc_fin_soft.controllers;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import com.devwmu.dc_fin_soft.entities.Event;
import com.devwmu.dc_fin_soft.repositories.EventRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;


// Fix outputs and inputs

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(final EventRepository eventRepository) {
    this.eventRepository = eventRepository;
    }
    @PutMapping("/events/search")
    public Iterable<Event> filterEvents(@RequestBody Filter[] filters){
        // CUSTOM
        // filterEvents(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: events

        // id: just equality
        // name: equality/ maybe LIKE
        // date: less than, equality
        // location: equality/ maybe LIKE
        // est_attendance: less than, greater, equality
        // fee_flag: equality
        // phil flagg: equality
        // conference flag: equality
        // deleted: equality
    
        // returns the events that match

        Specification<Event> spec = Specification.unrestricted();
        for (Filter filter: filters){
            String col = filter.getCol();
            String op = filter.getOp().toLowerCase();
            Object value = filter.getVal();

            if (value == null){
                continue;
            }

            Specification<Event> condition = null;
            switch (op) {
                case "like":
                    try{
                        String lower = "%" + value.toString().toLowerCase() + "%";
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.like(criteraBuilder.lower(root.get(col)), lower);
                        break;
                    }
                    catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "bw":
                    try {
                        ArrayList<String> value2 = (ArrayList<String>) value;
                        LocalDateTime date1 = LocalDateTime.parse(value2.get(0));
                        LocalDateTime date2 = LocalDateTime.parse(value2.get(1));
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.between(root.get(col), date1, date2);

                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "leq": 
                    try{
                        Integer val = (Integer) value;
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.lessThanOrEqualTo(root.get(col), val);
                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "geq":
                    try{
                        Integer val = (Integer) value;
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.greaterThanOrEqualTo(root.get(col), val);
                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "eq":
                    condition = (root, query, criteriaBuilder) -> 
                        criteriaBuilder.equal(root.get(col), value);
                    break;
            }
            
            if (condition != null){
                spec = spec.and(condition);
            }

        }
        return this.eventRepository.findAll(spec);
    }
    @GetMapping("/all_events")
    public Iterable<Event> getAllEvents() {
        return this.eventRepository.findAll();
    }
    
    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event){
        // createEvent(name, date, location, attendance, fee?, philanthropy?, conference?):
        //     Takes in info to create an entry in the Event table
        //     OUTPUT: created event

        return this.eventRepository.save(event);
    }

    @PutMapping("/event/edit_{id}")
    public Event editEvent(@PathVariable("id") Integer id, @RequestBody Event event){
        // editEvent(id, editArray[]): bool
        //     The ID of the event and the array of columns to be changed
        //     OUTPUT: success or not
        Optional<Event> eventToUpdateOptional = this.eventRepository.findById(id);
        if (!eventToUpdateOptional.isPresent()){
            return null;
        }
        Event newEvent = eventToUpdateOptional.get();

        if (event.getName() != null){
            newEvent.setName(event.getName());
        }
        if (event.getDate() != null){
            newEvent.setDate(event.getDate());
        }
        if (event.getLocation() != null){
            newEvent.setLocation(event.getLocation());
        }
        if (event.getEstAttendance() != null){
            newEvent.setEstAttendance(event.getEstAttendance());
        }
        if (event.getFeeFlag() != null){
            newEvent.setFeeFlag(event.getFeeFlag());
        }
        if (event.getPhilanthropyFlag() != null){
            newEvent.setPhilanthropyFlag(event.getPhilanthropyFlag());
        }
        if (event.getConferenceFlag() != null){
            newEvent.setConferenceFlag(event.getConferenceFlag());
        }
        if (event.getDeleted() != null){
            newEvent.setDeleted(event.getDeleted());
        }

        return this.eventRepository.save(newEvent);
    }

    @PutMapping("/event/fee_flag_id={id}_num={num}")
    public Event feeFlagEvent(@PathVariable("id") Integer id, @PathVariable("num") Integer num){
        // feeFlagEvent(id, num): bool
        //     The id of the item to change the fee flag (from database), and what to set it to
        //     OUTPUT: updated event
        Optional<Event> eventToUpdateOptional = this.eventRepository.findById(id);
        if (!eventToUpdateOptional.isPresent()){
            return null;
        }
        Event updateEvent = eventToUpdateOptional.get();
        if (num == 0){
            updateEvent.setFeeFlag(0);
        }
        else{
            updateEvent.setFeeFlag(1);
        }
        return this.eventRepository.save(updateEvent);
    }

    @PutMapping("/event/phil_flag_id={id}_num=_{num}")
    public Event philFlagEvent(@PathVariable("id") Integer id, @PathVariable("num") Integer num){
        // feeFlagEvent(id, num): bool
        //     The id of the item to change the fee flag (from database), and what to set it to
        //     OUTPUT: updated event
        Optional<Event> eventToUpdateOptional = this.eventRepository.findById(id);
        if (!eventToUpdateOptional.isPresent()){
            return null;
        }
        Event updateEvent = eventToUpdateOptional.get();
        if (num == 0){
            updateEvent.setPhilanthropyFlag(0);
        }
        else{
            updateEvent.setPhilanthropyFlag(1);
        }
        return this.eventRepository.save(updateEvent);
    }

    @PutMapping("/event/conf_flag_id={id}_num={num}")
    public Event confFlagEvent(@PathVariable("id") Integer id, @PathVariable("num") Integer num){
        // feeFlagEvent(id, num): bool
        //     The id of the item to change the fee flag (from database), and what to set it to
        //     OUTPUT: updated event
        Optional<Event> eventToUpdateOptional = this.eventRepository.findById(id);
        if (!eventToUpdateOptional.isPresent()){
            return null;
        }
        Event updateEvent = eventToUpdateOptional.get();
        if (num == 0){
            updateEvent.setConferenceFlag(0);
        }
        else{
            updateEvent.setConferenceFlag(1);
        }
        return this.eventRepository.save(updateEvent);
    }

    @PutMapping("/event/delete_{id}")
    public Event deleteEvent(@PathVariable("id") Integer id){
        // deleteEvent(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: deleted event
        Optional<Event> eventToDeleteOptional = this.eventRepository.findById(id);
        if (!eventToDeleteOptional.isPresent()){
            return null;
        }
        Event deleteEvent = eventToDeleteOptional.get();
        deleteEvent.setDeleted(1);
        return this.eventRepository.save(deleteEvent);
    }

    @PostMapping("/event_allocation_form")
    public Event createEventAllocationForm(){
        // CUSTOM
        // createEventAllocationForm(ExpenseID): bool
        //     Generates an Event request form
        //     OUTPUT: form

        // takes in the event id, extracts info for form, 
        // make calls to excel api to edit the excel file, 
        // then output the form
        return new Event();
    }

    @PostMapping("/conference_allocation_form")
    public Event createConferenceAllocationForm(){
        // custom
        // createConferenceAllocationForm(ExpenseID): bool
        //     Generate a conference request form
        //     OUTPUT: success or not

        // takes in the event id, extracts info for form, 
        // make calls to excel api to edit the excel file, 
        // then output the form
        return new Event();
    }
}
