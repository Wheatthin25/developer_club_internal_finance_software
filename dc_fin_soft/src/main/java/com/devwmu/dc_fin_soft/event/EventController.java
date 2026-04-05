package com.devwmu.dc_fin_soft.event;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/event")
public class EventController {
    @GetMapping("/filter_events")
    public FilterEvents filterEvents(){
        // filterEvents(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: events

        return new FilterEvents();
    }

    @PostMapping("/create_event")
    public CreateEvent createEvent(){
        // createEvent(name, date, location, attendance, fee?, philanthropy?, conference?):
        //     Takes in info to create an entry in the Event table
        //     OUTPUT: success or not

        return new CreateEvent();
    }

    @PutMapping("/edit_event")
    public EditEvent editEvent(){
        // editEvent(id, editArray[]): bool
        //     The ID of the event and the array of columns to be changed
        //     OUTPUT: success or not

        return new EditEvent();
    }

    @DeleteMapping("/delete_event")
    public DeleteEvent deleteEvent(){
        // deleteEvent(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new DeleteEvent();
    }

    @PostMapping("/create_event_allocation_form")
    public CreateEventAllocationForm createEventAllocationForm(){
        // createEventAllocationForm(ExpenseID): bool
        //     Generates an Event request form
        //     OUTPUT: success or not

        return new CreateEventAllocationForm();
    }

    @PostMapping("/create_conference_allocation_form")
    public CreateConferenceAllocationForm createConferenceAllocationForm(){
        // createConferenceAllocationForm(ExpenseID): bool
        //     Generate a conference request form
        //     OUTPUT: success or not

        return new CreateConferenceAllocationForm();
    }
}
