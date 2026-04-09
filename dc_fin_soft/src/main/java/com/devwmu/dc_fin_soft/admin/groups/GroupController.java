package com.devwmu.dc_fin_soft.admin.groups;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/groups")
public class GroupController {
    @GetMapping("/finance_groups/search")
    public FilterFinanceGroups filterFinanceGroups(){
    // filterFinanceGroups(filterArray[]): Group (?? data type)	
        //     Filters through the finance groups based on array specs
        //     OUTPUT: success or not

        return new FilterFinanceGroups();
    }

    @PostMapping("/finance_group_users/{user}")
    public AddUserToGroup addUserToGroup(){
        // addUserToGroup(user, group): bool
        //     Adds a specific user to a group
        //     OUTPUT: success or not

        return new AddUserToGroup();
    }

    @DeleteMapping("/finance_group_users/{user}")
    public RemoveUserFromGroup removeUserFromGroup(){
        // removeUserFromGroup(user, group): bool
        //     Removes a specific user from a group
        //     OUTPUT: success or not

        return new RemoveUserFromGroup();
    }

    @PostMapping("/finance_group")
    public CreateGroup createGroup(){
        // createGroup(name): bool
        //     Creates a new finance group
        //     OUTPUT: success or not

        return new CreateGroup();
    }

    @DeleteMapping("/finance_group/{id}")
    public RemoveGroup removeGroup(){
        // removeGroup(name): bool
        //     removes a group by its name
        //     OUTPUT: success or not

        return new RemoveGroup();
    }

}
