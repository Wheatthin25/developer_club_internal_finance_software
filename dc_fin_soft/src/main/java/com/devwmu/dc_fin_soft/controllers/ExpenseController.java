package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Expense;
import com.devwmu.dc_fin_soft.entities.Source;

// Fix outputs and inputs

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @GetMapping("/sources/search")
    public Source filterSources(@RequestParam String[] filterArray) {
        // filterSources(filterArray[]) ?
        //      Take an array of column names and desired values, and output the selected SQL rows
        //      OUTPUT: sources

        return new Source();
    }

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

    @PutMapping("/item/{id}")
    public Expense editItem(){
        // editItem(id, editArray[]): bool
        //     The ID of the item and the array of columns to be changed
        //     OUTPUT: success or not

        return new Expense();
    }

    @DeleteMapping("/item{id}")
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

}
