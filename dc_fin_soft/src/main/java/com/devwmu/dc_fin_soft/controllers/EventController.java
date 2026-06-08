package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Event;
import com.devwmu.dc_fin_soft.repositories.EventRepository;
import java.util.Optional;


// Fix outputs and inputs

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(final EventRepository eventRepository) {
    this.eventRepository = eventRepository;
    }
    @GetMapping("/events/search")
    public Event filterEvents(){
        // custom
        // filterEvents(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: events

        return new Event();
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
        // custom
        // createEventAllocationForm(ExpenseID): bool
        //     Generates an Event request form
        //     OUTPUT: success or not

        return new Event();
    }

    @PostMapping("/conference_allocation_form")
    public Event createConferenceAllocationForm(){
        // custom
        // createConferenceAllocationForm(ExpenseID): bool
        //     Generate a conference request form
        //     OUTPUT: success or not

        return new Event();
    }
}
