package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Event;

// Fix outputs and inputs

@RestController
@RequestMapping("/event")
public class EventController {
    @GetMapping("/events/search")
    public Event filterEvents(){
        // filterEvents(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: events

        return new Event();
    }

    @PostMapping("/event")
    public Event createEvent(){
        // createEvent(name, date, location, attendance, fee?, philanthropy?, conference?):
        //     Takes in info to create an entry in the Event table
        //     OUTPUT: success or not

        return new Event();
    }

    @PutMapping("/event/{id}")
    public Event editEvent(){
        // editEvent(id, editArray[]): bool
        //     The ID of the event and the array of columns to be changed
        //     OUTPUT: success or not

        return new Event();
    }

    @DeleteMapping("/event/{id}")
    public Event deleteEvent(){
        // deleteEvent(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new Event();
    }

    @PostMapping("/event_allocation_form")
    public Event createEventAllocationForm(){
        // createEventAllocationForm(ExpenseID): bool
        //     Generates an Event request form
        //     OUTPUT: success or not

        return new Event();
    }

    @PostMapping("/conference_allocation_form")
    public Event createConferenceAllocationForm(){
        // createConferenceAllocationForm(ExpenseID): bool
        //     Generate a conference request form
        //     OUTPUT: success or not

        return new Event();
    }
}
