package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Expense;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/reimbursements")
public class ReimbursementController {
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
