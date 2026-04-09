package com.devwmu.dc_fin_soft.calendar;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @GetMapping("/calendar_events/search")
    public FilterCalendarEvents filterCalendarEvents(){
        // filterCalendarEvents(filterArray[]) ???
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: calendar events

        return new FilterCalendarEvents();
    }

    @PostMapping("/calendar_event")
    public CreateCalendarEvent createCalendarEvent(){
        // createCalendarEvent(name, location, start, end, creator, group, category): success
        //     Uses the input info to enter a calendar event into the database
        //     OUTPUT: success or not

        return new CreateCalendarEvent();
    }

    @PutMapping("/calendar_event/{id}")
    public EditCalendarEvent editCalendarEvent(){
        // editCalendarEvent(id, editArray[]): success
        //     The ID of the calendar event and the array of columns to be changed
        //     OUTPUT: success or not

        return new EditCalendarEvent();
    }

    @DeleteMapping("/calendar_event/{id}")
    public DeleteCalendarEvent deleteCalendarEvent(){
        // deleteCalendarEvent(id): success
        //     The id of the calendar event to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new DeleteCalendarEvent();
    }

}
