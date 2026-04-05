package com.devwmu.dc_fin_soft.admin.groups;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/groups")
public class GroupController {
    @GetMapping("/filter_finance_groups")
    public FilterFinanceGroups filterFinanceGroups(){
    // filterFinanceGroups(filterArray[]): Group (?? data type)	
        //     Filters through the finance groups based on array specs
        //     OUTPUT: success or not

        return new FilterFinanceGroups();
    }

    @PostMapping("/add_user_to_group")
    public AddUserToGroup addUserToGroup(){
        // addUserToGroup(user, group): bool
        //     Adds a specific user to a group
        //     OUTPUT: success or not

        return new AddUserToGroup();
    }

    @DeleteMapping("/remove_user_from_group")
    public RemoveUserFromGroup removeUserFromGroup(){
        // removeUserFromGroup(user, group): bool
        //     Removes a specific user from a group
        //     OUTPUT: success or not

        return new RemoveUserFromGroup();
    }

    @PostMapping("/create_group")
    public CreateGroup createGroup(){
        // createGroup(name): bool
        //     Creates a new finance group
        //     OUTPUT: success or not

        return new CreateGroup();
    }

    @DeleteMapping("/remove_group")
    public RemoveGroup removeGroup(){
        // removeGroup(name): bool
        //     removes a group by its name
        //     OUTPUT: success or not

        return new RemoveGroup();
    }

}
