package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Expense;

// Fix outputs and inputs

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @GetMapping("/expenses/search")
    public Expense filterExpenses(@RequestParam String[] filterArray){
        // filterExpenses(filterArray[]) ?
        //     Take an array of column names and the desired value, and output the selected SQL rows
        //     OUTPUT: expenses

        return new Expense();
    }

    @PostMapping("/item")
    public Expense budgetItem(){
        // budgetItem(name, qty, pricePerUnit, totalPrice, purpose, vendor, foodFlag, eventID, source, link, deadline, community, payment_type, pickup_location) bool
        //     Takes in info to create an entry in the Expenses table and outputs if successful
        //     OUTPUT: success or not

        return new Expense();
    }

    @PutMapping("/item/edit_{id}")
    public Expense editItem(){
        // editItem(id, editArray[]): bool
        //     The ID of the item and the array of columns to be changed
        //     OUTPUT: success or not

        return new Expense();
    }

    @DeleteMapping("/item/delete_{id}")
    public Expense deleteItem() {
        // deleteItem(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new Expense();
    }

    @PostMapping("/operational_allocation_form")
    public Expense createOperationalAllocationForm(){
        // createOperationalAllocationForm(ExpenseID): bool
        //     Generate an operational allocation request form
        //     OUTPUT: success or not

        return new Expense();
    }

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

    @PutMapping("/expense/{id}")
    public Expense approveExpense(){
        // approveExpense(ExpenseID, decision) bool
        //     Toggling approve in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }

    @PostMapping("/allocation_not_spent")
    public Expense allocationNotSpentAlert(){
        // allocationNotSpentAlert(expenseID) success
        //     Sends an alert to the dev club admin if [CONDITION] 
        //     OUTPUT: success or not

        return new Expense();
    }

    @PostMapping("/food_budget_too_high")
    public Expense foodBudgetTooHighAlert(){
        // foodBudgetTooHighAlert(expenseID) success
        //     Sends an alert to the dev club admin if the food budget is greater than 20 dollars per estimated attendee
        //     OUTPUT: success or not
        return new Expense();
    }

    @PostMapping("/allocation_too_big")
    public Expense allocationTooBigAlert(){
        // allocationTooBigAlert(expenseID) success
        //     Sends an alert to the dev club admin if the allocation is too big for the amount of money in the source
        //     OUTPUT: success or not
        return new Expense();
    }

    @PostMapping("/deadline_past")
    public Expense deadlinePastAlert(){
        // deadlinePastAlert(expenseID) success
        //     Sends an alert to the dev club admin if the deadline for an item is in the past
        //     OUTPUT: success or not
        return new Expense();
    }

    @GetMapping("/total_price")
    public Expense calculateRecommendedTotalPrice(){
        // calcRecommendedTotalPrice(qty, pricePerUnit) double
        //     Calculating total price
        //     OUTPUT: recommended total price

        return new Expense();
    }

    @GetMapping("/source")
    public Expense calculateRecommendedSource(){
        // calcRecommendedSource(totalPrice, type, curDate) str
        //     Recommends a source
        //     OUTPUT: recommended source

        return new Expense();
    }

    @PostMapping("/receipt")
    public Expense addReceipt(){
        // addReceipt(imgFile) success
        //     Adds a receipt to the Google Drive
        //     OUTPUT: success or not

        return new Expense();
    }

    @PutMapping("/reimbursed/{id}")
    public Expense reimbursed(){
        // reimbursed(ExpenseID, decision) bool
        //     Toggling reimbursed in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }

}
