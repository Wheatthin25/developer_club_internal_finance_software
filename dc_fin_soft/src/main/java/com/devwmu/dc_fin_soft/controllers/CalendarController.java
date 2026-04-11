package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.CalendarEvent;

// Fix outputs and inputs

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @GetMapping("/calendar_events/search")
    public CalendarEvent filterCalendarEvents(){
        // filterCalendarEvents(filterArray[]) ???
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: calendar events

        return new CalendarEvent();
    }

    @PostMapping("/calendar_event")
    public CalendarEvent createCalendarEvent(){
        // createCalendarEvent(name, location, start, end, creator, group, category): success
        //     Uses the input info to enter a calendar event into the database
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

    @PutMapping("/calendar_event/{id}")
    public CalendarEvent editCalendarEvent(){
        // editCalendarEvent(id, editArray[]): success
        //     The ID of the calendar event and the array of columns to be changed
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

    @DeleteMapping("/calendar_event/{id}")
    public CalendarEvent deleteCalendarEvent(){
        // deleteCalendarEvent(id): success
        //     The id of the calendar event to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

}
