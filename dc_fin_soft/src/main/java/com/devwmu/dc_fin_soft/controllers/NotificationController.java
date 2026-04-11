package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Notification;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/notifications")
public class NotificationController {
    @PostMapping("/new_request")
    public Notification newRequestNotify(){
        // newRequestNotify(RequestID, email(s)): bool
        //     Sends a notification to the admin of the dev club about a new request
        //     OUTPUT: success or not

        return new Notification();
    }

    @PostMapping("/request_status_updated")
    public Notification requestStatusUpdatedNotify(){
        // requestStatusUpdatedNotify(requestID, update): bool
        //     Updates the requestee on the request that there has been a change to their request (and what the change is)
        //     OUTPUT: success or not

        return new Notification();
    }

    @PostMapping("/reimbursement_deadline_soon")
    public Notification reimbursementDeadlineSoonNotify(){
        // reimbursementDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the reimbursement deadline is approaching
        //     OUTPUT: success or not

        return new Notification();
    }

    @PostMapping("/deliberation_deadline_soon")
    public Notification deliberationDeadlineSoonNotify(){
        // deliberationDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the deliberation deadline is approaching
        //     OUTPUT: success or not

        return new Notification();
    }

    @PostMapping("/item_deadline_soon")
    public Notification itemDeadlineSoonNotify(){
        // itemDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the item deadline is approaching
        //     OUTPUT: success or not

        return new Notification();
    }

    @PostMapping("/allocate_deadline_soon")
    public Notification allocateDeadlineSoonNotify(){
        // allocateDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the allocation deadline is approaching
        //     OUTPUT: success or not

        return new Notification();
    }
}
