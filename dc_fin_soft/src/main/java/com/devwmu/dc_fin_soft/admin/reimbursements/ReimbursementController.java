package com.devwmu.dc_fin_soft.admin.reimbursements;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/reimbursements")
public class ReimbursementController {
    @PostMapping("/add_receipt")
    public AddReceipt addReceipt(){
        // addReceipt(imgFile) success
        //     Adds a receipt to the Google Drive
        //     OUTPUT: success or not

        return new AddReceipt();
    }

    @PutMapping("/reimbursed")
    public Reimbursed reimbursed(){
        // reimbursed(ExpenseID, decision) bool
        //     Toggling reimbursed in the expense table
        //     OUTPUT: success or not

        return new Reimbursed();
    }
}
