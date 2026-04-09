package com.devwmu.dc_fin_soft.admin.approvals;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/approvals")
public class ApprovalsController {
    @PutMapping("/request/{id}")
    public ApproveRequest approveRequest(){
        // approveRequest(id, decision) bool: 
        //     will mark a request as approved/disapproved in the club requests table
        //     OUTPUT: success or not

        return new ApproveRequest();
    }

    @PutMapping("/expense/{id}")
    public ApproveExpense approveExpense(){
        // approveExpense(ExpenseID, decision) bool
        //     Toggling approve in the expense table
        //     OUTPUT: success or not

        return new ApproveExpense();
    }
}
