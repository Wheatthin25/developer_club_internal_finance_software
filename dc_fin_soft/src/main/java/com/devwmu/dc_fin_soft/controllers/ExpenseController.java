package com.devwmu.dc_fin_soft.controllers;
import com.devwmu.dc_fin_soft.repositories.ExpenseRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import com.devwmu.dc_fin_soft.entities.Expense;

// Fix outputs and inputs

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    private final ExpenseRepository expenseRepository;

    ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @GetMapping("/expenses/search")
    public Expense filterExpenses(@RequestParam String[] filterArray){
        // filterExpenses(filterArray[]) ?
        //     Take an array of column names and the desired value, and output the selected SQL rows
        //     OUTPUT: expenses

        return new Expense();
    }

    @PostMapping("/item")
    public Expense budgetItem(@RequestBody Expense expense){
        // budgetItem(name, qty, pricePerUnit, totalPrice, purpose, vendor, foodFlag, eventID, source, link, deadline, community, payment_type, pickup_location) bool
        //     Takes in info to create an entry in the Expenses table and outputs if successful
        //     OUTPUT: success or not

        return this.expenseRepository.save(expense);
    }

    @PutMapping("/item/edit_{id}")
    public Expense editItem(@PathVariable("id") Integer id, @RequestBody Expense expense){
        // editItem(id, editArray[]): bool
        //     The ID of the item and the array of columns to be changed
        //     OUTPUT: success or not

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }

        Expense expenseToUpdate = expenseToUpdateOptional.get();
        if (expense.getName() != null){
            expenseToUpdate.setName(expense.getName());
        }
        if (expense.getQuantity() != null){
            expenseToUpdate.setQuantity(expense.getQuantity());
        }
        if (expense.getPricePerUnit() != null){
            expenseToUpdate.setPricePerUnit(expense.getPricePerUnit());
        }
        if (expense.getTotalPrice() != null){
            expenseToUpdate.setTotalPrice(expense.getTotalPrice());
        }
        if (expense.getPurpose() != null){
            expenseToUpdate.setPurpose(expense.getPurpose());
        }
        if (expense.getVendor() != null){
            expenseToUpdate.setVendor(expense.getVendor());
        }
        if (expense.getSourceId() != null){
            expenseToUpdate.setSourceId(expense.getSourceId());
        }
        if (expense.getLink() != null){
            expenseToUpdate.setLink(expense.getLink());
        }
        if (expense.getItemDeadline() != null){
            expenseToUpdate.setItemDeadline(expense.getItemDeadline());
        }
        if (expense.getCommunity() != null){
            expenseToUpdate.setCommunity(expense.getCommunity());
        }
        if (expense.getFoodFlag() != null){
            expenseToUpdate.setFoodFlag(expense.getFoodFlag());
        }
        if (expense.getRequestedFlag() != null){
            expenseToUpdate.setRequestedFlag(expense.getRequestedFlag());
        }
        if (expense.getApprovedFlag() != null){
            expenseToUpdate.setApprovedFlag(expense.getApprovedFlag());
        }
        if (expense.getStartedBuyingFlag() != null){
            expenseToUpdate.setStartedBuyingFlag(expense.getStartedBuyingFlag());
        }
        if (expense.getFinishedBuyingFlag() != null){
            expenseToUpdate.setFinishedBuyingFlag(expense.getFinishedBuyingFlag());
        }
        if (expense.getPickedUpFlag() != null){
            expenseToUpdate.setPickedUpFlag(expense.getPickedUpFlag());
        }
        if (expense.getReimbursedFlag() != null){
            expenseToUpdate.setReimbursedFlag(expense.getReimbursedFlag());
        }
        if (expense.getMoneyRemaining() != null){
            expenseToUpdate.setMoneyRemaining(expense.getMoneyRemaining());
        }
        if (expense.getTotalSpent() != null){
            expenseToUpdate.setTotalSpent(expense.getTotalSpent());
        }
        if (expense.getPickupLocation() != null){
            expenseToUpdate.setPickupLocation(expense.getPickupLocation());
        }
        if (expense.getAllocationDeadline() != null){
            expenseToUpdate.setAllocationDeadline(expense.getAllocationDeadline());
        }
        if (expense.getDeliberationDeadline() != null){
            expenseToUpdate.setDeliberationDeadline(expense.getDeliberationDeadline());
        }
        if (expense.getReimbursementDeadline() != null){
            expenseToUpdate.setReimbursementDeadline(expense.getReimbursementDeadline());
        }
        if (expense.getPaymentType() != null){
            expenseToUpdate.setPaymentType(expense.getPaymentType());
        }
        if (expense.getDeleted() != null){
            expenseToUpdate.setDeleted(expense.getDeleted());
        }
        
        return this.expenseRepository.save(expenseToUpdate);
    }

    @PutMapping("/item/food_flag_id={id}_num={num}")
    public Expense FoodFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setFoodFlag(0);
        }
        else{
            expense.setFoodFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/requested_flag_id={id}_num={num}")
    public Expense requestedFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setRequestedFlag(0);
        }
        else{
            expense.setRequestedFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/s_buying_flag_id={id}_num={num}")
    public Expense sBuyingFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setStartedBuyingFlag(0);
        }
        else{
            expense.setStartedBuyingFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/f_buying_flag_id={id}_num={num}")
    public Expense fBuyingFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setFinishedBuyingFlag(0);
        }
        else{
            expense.setFinishedBuyingFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/picked_up_flag_id={id}_num={num}")
    public Expense pickedUpFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setPickedUpFlag(0);
        }
        else{
            expense.setPickedUpFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/reimbursed_flag_id={id}_num={num}")
    public Expense reimbursedFlagItem(@PathVariable("id") Integer id, @PathVariable("num") Integer num) {
        // deleteItem(id): bool
        //     The id of the item to be updates (from display, not database)
        //     OUTPUT: updated expense

        Optional<Expense> expenseToUpdateOptional = this.expenseRepository.findById(id);
        if (!expenseToUpdateOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToUpdateOptional.get();
        if (num == 0){
            expense.setReimbursedFlag(0);
        }
        else{
            expense.setReimbursedFlag(1);
        }
        
        return this.expenseRepository.save(expense);    
    }

    @PutMapping("/item/delete_{id}")
    public Expense deleteItem(@PathVariable("id") Integer id) {
        // deleteItem(id): bool
        //     The id of the item to be deleted (from display, not database)
        //     OUTPUT: success or not

        Optional<Expense> expenseToDeleteOptional = this.expenseRepository.findById(id);
        if (!expenseToDeleteOptional.isPresent()){
            return null;
        }
        Expense expense = expenseToDeleteOptional.get();
        expense.setDeleted(1);
        
        return this.expenseRepository.save(expense);    
    }

    @PostMapping("/operational_allocation_form")
    public Expense createOperationalAllocationForm(){
        // createOperationalAllocationForm(ExpenseID): bool
        //     Generate an operational allocation request form
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
}
