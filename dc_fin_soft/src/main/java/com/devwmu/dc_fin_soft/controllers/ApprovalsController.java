package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Request;
import com.devwmu.dc_fin_soft.entities.Expense;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/approvals")
public class ApprovalsController {
    @PutMapping("/request/{id}")
    public Request approveRequest(){
        // approveRequest(id, decision) bool: 
        //     will mark a request as approved/disapproved in the club requests table
        //     OUTPUT: success or not

        return new Request();
    }

    @PutMapping("/expense/{id}")
    public Expense approveExpense(){
        // approveExpense(ExpenseID, decision) bool
        //     Toggling approve in the expense table
        //     OUTPUT: success or not

        return new Expense();
    }
}
