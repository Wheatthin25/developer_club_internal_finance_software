package com.devwmu.dc_fin_soft.admin.update_expense;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/update_expense")
public class UpdateExpenseController {
    @PutMapping("/started_buying_expense/{id}")
    public StartedBuyingExpense startedBuyingExpense(){
        // startedBuyingExpense(ExpenseID, decision) bool
        //     Toggling started buying in the expense table
        //     OUTPUT: success or not

        return new StartedBuyingExpense();
    }

    @PutMapping("/requested_expense/{id}")
    public RequestedExpense requestedExpense(){
        // requestedExpense(ExpenseID, decision) bool
        //     Toggling started buying in the expense table
        //     OUTPUT: success or not

        return new RequestedExpense();
    }

    @PutMapping("/finished_buying_expense/{id}")
    public FinishedBuyingExpense finishedBuyingExpense(){
        // finishedBuyingExpense(ExpenseID, decision) bool
        //     Toggling finishedBuying in the expense table
        //     OUTPUT: success or not

        return new FinishedBuyingExpense();
    }

    @PutMapping("/picked_up/{id}")
    public PickedUp pickedUp(){
        // pickedUp(ExpenseID, decision): bool
        //     Toggling picked up in the expense table
        //     OUTPUT: success or not

        return new PickedUp();
    }
}
