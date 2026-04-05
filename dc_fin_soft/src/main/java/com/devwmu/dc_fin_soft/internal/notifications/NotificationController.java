package com.devwmu.dc_fin_soft.internal.notifications;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/notifications")
public class NotificationController {
    @PostMapping("/new_request_notify")
    public NewRequestNotify newRequestNotify(){
        // newRequestNotify(RequestID, email(s)): bool
        //     Sends a notification to the admin of the dev club about a new request
        //     OUTPUT: success or not

        return new NewRequestNotify();
    }

    @PostMapping("/request_status_updated_notify")
    public RequestStatusUpdatedNotify requestStatusUpdatedNotify(){
        // requestStatusUpdatedNotify(requestID, update): bool
        //     Updates the requestee on the request that there has been a change to their request (and what the change is)
        //     OUTPUT: success or not

        return new RequestStatusUpdatedNotify();
    }

    @PostMapping("/reimbursement_deadline_soon_notify")
    public ReimbursementDeadlineSoonNotify reimbursementDeadlineSoonNotify(){
        // reimbursementDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the reimbursement deadline is approaching
        //     OUTPUT: success or not

        return new ReimbursementDeadlineSoonNotify();
    }

    @PostMapping("/deliberation_deadline_soon_notify")
    public DeliberationDeadlineSoonNotify deliberationDeadlineSoonNotify(){
        // deliberationDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the deliberation deadline is approaching
        //     OUTPUT: success or not

        return new DeliberationDeadlineSoonNotify();
    }

    @PostMapping("/item_deadline_soon_notify")
    public ItemDeadlineSoonNotify itemDeadlineSoonNotify(){
        // itemDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the item deadline is approaching
        //     OUTPUT: success or not

        return new ItemDeadlineSoonNotify();
    }

    @PostMapping("/allocate_deadline_soon_notify")
    public AllocateDeadlineSoonNotify allocateDeadlineSoonNotify(){
        // allocateDeadlineSoonNotify(): bool
        //     Sends a notification to the dev club admin if the allocation deadline is approaching
        //     OUTPUT: success or not

        return new AllocateDeadlineSoonNotify();
    }
}
