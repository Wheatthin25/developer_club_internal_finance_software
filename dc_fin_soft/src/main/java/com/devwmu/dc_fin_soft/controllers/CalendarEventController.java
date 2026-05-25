package com.devwmu.dc_fin_soft.controllers;
import com.devwmu.dc_fin_soft.DcFinSoftApplication;
import com.devwmu.dc_fin_soft.repositories.CalendarRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import com.devwmu.dc_fin_soft.entities.CalendarEvent;

// Fix outputs and inputs

// @PreAuthorize("hasRole('ADMIN')) to check role of the user
// when they log in, assign/check role

@RestController
@RequestMapping("/calendar")
public class CalendarEventController {
    private final CalendarRepository calendarRepository;

    CalendarEventController(CalendarRepository calendarRepository, RequestController requestController, DcFinSoftApplication dcFinSoftApplication) {
        this.calendarRepository = calendarRepository;
    }

    @GetMapping("/calendar_events/search")
    public CalendarEvent filterCalendarEvents(){
        // filterCalendarEvents(filterArray[]) ???
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: calendar events

        return new CalendarEvent();
    }

    @PostMapping("/calendar_event")
    public CalendarEvent createCalendarEvent(@RequestBody CalendarEvent calendarEvent){
        // createCalendarEvent(name, location, start, end, creator, group, category): success
        //     Uses the input info to enter a calendar event into the database
        //     OUTPUT: success or not

        return this.calendarRepository.save(calendarEvent);
    }

    @PutMapping("/calendar_event/edit_{id}")
    public CalendarEvent editCalendarEvent(@PathVariable("id") Integer id, @RequestBody CalendarEvent calendarEvent){
        // editCalendarEvent(id, editArray[]): success
        //     The ID of the calendar event and the array of columns to be changed
        //     OUTPUT: success or not
        Optional<CalendarEvent> calendarEventToUpdateOptional = this.calendarRepository.findById(id);
        if(!calendarEventToUpdateOptional.isPresent()){
            return null;
        }

        CalendarEvent calendarEventToUpdate = calendarEventToUpdateOptional.get();

        if (calendarEvent.getEventName() != null){
            calendarEventToUpdate.setEventName(calendarEvent.getEventName());
        }
        if (calendarEvent.getLocation() != null){
            calendarEventToUpdate.setLocation(calendarEvent.getLocation());
        }
        if (calendarEvent.getStartDateTime() != null){
            calendarEventToUpdate.setStartDateTime(calendarEvent.getStartDateTime());
        }
        if (calendarEvent.getEndDateTime() != null){
            calendarEventToUpdate.setEndDateTime(calendarEvent.getEndDateTime());
        }
        if (calendarEvent.getCreator() != null){
            calendarEventToUpdate.setCreator(calendarEvent.getCreator());
        }
        if (calendarEvent.getGroupId() != null){
            calendarEventToUpdate.setGroupId(calendarEvent.getGroupId());
        }
        if (calendarEvent.getCategory() != null){
            calendarEventToUpdate.setCategory(calendarEvent.getCategory());
        }
        if (calendarEvent.getDeleted() != null){
            calendarEventToUpdate.setDeleted(calendarEvent.getDeleted());
        }
        
        return this.calendarRepository.save(calendarEventToUpdate);
           
    }

    @DeleteMapping("/calendar_event/delete_{id}")
    public CalendarEvent deleteCalendarEvent(@PathVariable("id") Integer id){
        // deleteCalendarEvent(id): success
        //     The id of the calendar event to be deleted (from display, not database)
        //     OUTPUT: success or not

        Optional<CalendarEvent> calendarEventToDeleteOptional = this.calendarRepository.findById(id);
        if (!calendarEventToDeleteOptional.isPresent()){
            return null;
        }
        CalendarEvent calendarEvent = calendarEventToDeleteOptional.get();
        calendarEvent.setDeleted(1);
        
        return this.calendarRepository.save(calendarEvent);     
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
