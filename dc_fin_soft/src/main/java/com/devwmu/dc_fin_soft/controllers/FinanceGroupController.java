package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.FinanceGroup;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/groups")
public class FinanceGroupController {
    @GetMapping("/finance_groups/search")
    public FinanceGroup filterFinanceGroups(){
    // filterFinanceGroups(filterArray[]): Group (?? data type)	
        //     Filters through the finance groups based on array specs
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @PostMapping("/finance_group_users/{user}")
    public FinanceGroup addUserToGroup(){
        // addUserToGroup(user, group): bool
        //     Adds a specific user to a group
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @DeleteMapping("/finance_group_users/{user}")
    public FinanceGroup removeUserFromGroup(){
        // removeUserFromGroup(user, group): bool
        //     Removes a specific user from a group
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @PostMapping("/finance_group")
    public FinanceGroup createGroup(){
        // createGroup(name): bool
        //     Creates a new finance group
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @DeleteMapping("/finance_group/{id}")
    public FinanceGroup removeGroup(){
        // removeGroup(name): bool
        //     removes a group by its name
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

}
