package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Expense;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/update_expense")
public class UpdateExpenseController {
    @PutMapping("/started_buying_expense/{id}")
    public Expense startedBuyingExpense(){
        // startedBuyingExpense(ExpenseID, decision) bool
        //     Toggling started buying in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }

    @PutMapping("/requested_expense/{id}")
    public Expense requestedExpense(){
        // requestedExpense(ExpenseID, decision) bool
        //     Toggling started buying in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }

    @PutMapping("/finished_buying_expense/{id}")
    public Expense finishedBuyingExpense(){
        // finishedBuyingExpense(ExpenseID, decision) bool
        //     Toggling finishedBuying in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }

    @PutMapping("/picked_up/{id}")
    public Expense pickedUp(){
        // pickedUp(ExpenseID, decision): bool
        //     Toggling picked up in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }
}
