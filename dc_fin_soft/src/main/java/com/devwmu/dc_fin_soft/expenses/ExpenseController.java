package com.devwmu.dc_fin_soft.expenses;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @GetMapping("/filter_sources")
    public FilterSources filterSources(@RequestParam String[] filterArray) {
        // filterSources(filterArray[]) ?
        //      Take an array of column names and desired values, and output the selected SQL rows
        //      OUTPUT: sources

        return new FilterSources();
    }

    @GetMapping("/filter_expenses")
    public FilterExpenses filterExpenses(@RequestParam String[] filterArray){
        // filterExpenses(filterArray[]) ?
        //     Take an array of column names and the desired value, and output the selected SQL rows
        //     OUTPUT: expenses

        return new FilterExpenses();
    }

    @PostMapping("/budget_item")
    public BudgetItem budgetItem(){
        // budgetItem(name, qty, pricePerUnit, totalPrice, purpose, vendor, foodFlag, eventID, source, link, deadline, community, payment_type, pickup_location) bool
        //     Takes in info to create an entry in the Expenses table and outputs if successful
        //     OUTPUT: success or not

        return new BudgetItem();
    }

    @PutMapping("/edit_item")
    public EditItem editItem(){
        // editItem(id, editArray[]): bool
        //     The ID of the item and the array of columns to be changed
        //     OUTPUT: success or not

        return new EditItem();
    }

    @DeleteMapping("/delete_item")
    public DeleteItem deleteItem() {
        // deleteItem(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: success or not

        return new DeleteItem();
    }

    @PostMapping("/create_operational_allocation_form")
    public CreateOperationalAllocationForm createOperationalAllocationForm(){
        // createOperationalAllocationForm(ExpenseID): bool
        //     Generate an operational allocation request form
        //     OUTPUT: success or not

        return new CreateOperationalAllocationForm();
    }

}
