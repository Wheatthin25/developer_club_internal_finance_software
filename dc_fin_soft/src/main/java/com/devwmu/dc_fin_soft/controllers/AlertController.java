package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Alert;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/alert")
public class AlertController {
    @PostMapping("/allocation_not_spent")
    public Alert allocationNotSpentAlert(){
        // allocationNotSpentAlert(expenseID) success
        //     Sends an alert to the dev club admin if [CONDITION] 
        //     OUTPUT: success or not

        return new Alert();
    }

    @PostMapping("/food_budget_too_high")
    public Alert foodBudgetTooHighAlert(){
        // foodBudgetTooHighAlert(expenseID) success
        //     Sends an alert to the dev club admin if the food budget is greater than 20 dollars per estimated attendee
        //     OUTPUT: success or not
        return new Alert();
    }

    @PostMapping("/allocation_too_big")
    public Alert allocationTooBigAlert(){
        // allocationTooBigAlert(expenseID) success
        //     Sends an alert to the dev club admin if the allocation is too big for the amount of money in the source
        //     OUTPUT: success or not
        return new Alert();
    }

    @PostMapping("/deadline_past")
    public Alert deadlinePastAlert(){
        // deadlinePastAlert(expenseID) success
        //     Sends an alert to the dev club admin if the deadline for an item is in the past
        //     OUTPUT: success or not
        return new Alert();
    }
}
