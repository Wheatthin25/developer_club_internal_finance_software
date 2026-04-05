package com.devwmu.dc_fin_soft.internal.alerts;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/alert")
public class AlertController {
    @PostMapping("/allocation_not_spent_alert")
    public AllocationNotSpentAlert allocationNotSpentAlert(){
        // allocationNotSpentAlert(expenseID) success
        //     Sends an alert to the dev club admin if [CONDITION] 
        //     OUTPUT: success or not

        return new AllocationNotSpentAlert();
    }

    @PostMapping("/food_budget_too_high_alert")
    public FoodBudgetTooHighAlert foodBudgetTooHighAlert(){
        // foodBudgetTooHighAlert(expenseID) success
        //     Sends an alert to the dev club admin if the food budget is greater than 20 dollars per estimated attendee
        //     OUTPUT: success or not
        return new FoodBudgetTooHighAlert();
    }

    @PostMapping("/allocation_too_big_alert")
    public AllocationTooBigAlert allocationTooBigAlert(){
        // allocationTooBigAlert(expenseID) success
        //     Sends an alert to the dev club admin if the allocation is too big for the amount of money in the source
        //     OUTPUT: success or not
        return new AllocationTooBigAlert();
    }

    @PostMapping("/deadline_past_alert")
    public DeadlinePastAlert deadlinePastAlert(){
        // deadlinePastAlert(expenseID) success
        //     Sends an alert to the dev club admin if the deadline for an item is in the past
        //     OUTPUT: success or not
        return new DeadlinePastAlert();
    }
}
