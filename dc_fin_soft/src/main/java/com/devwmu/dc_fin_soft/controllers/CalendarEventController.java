package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.CalendarEvent;

// Fix outputs and inputs

// @PreAuthorize("hasRole('ADMIN')) to check role of the user
// when they log in, assign/check role

@RestController
@RequestMapping("/calendar")
public class CalendarEventController {
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

    @PostMapping("/reimbursement_deadline_soon")
    public CalendarEvent reimbursementDeadlineSoonNotify(){
        // reimbursementDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the reimbursement deadline is approaching
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

    @PostMapping("/deliberation_deadline_soon")
    public CalendarEvent deliberationDeadlineSoonNotify(){
        // deliberationDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the deliberation deadline is approaching
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

    @PostMapping("/item_deadline_soon")
    public CalendarEvent itemDeadlineSoonNotify(){
        // itemDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the item deadline is approaching
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

    @PostMapping("/allocate_deadline_soon")
    public CalendarEvent allocateDeadlineSoonNotify(){
        // allocateDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the allocation deadline is approaching
        //     OUTPUT: success or not

        return new CalendarEvent();
    }

}
