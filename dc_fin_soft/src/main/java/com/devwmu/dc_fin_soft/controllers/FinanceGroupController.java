package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.FinanceGroup;
import com.devwmu.dc_fin_soft.repositories.FinanceGroupRepository;
import java.util.Optional;


// Fix outputs and inputs

@RestController
@RequestMapping("/admin/groups")
public class FinanceGroupController {
    private final FinanceGroupRepository financeGroupRepository;

    public FinanceGroupController(final FinanceGroupRepository financeGroupRepository) {
    this.financeGroupRepository = financeGroupRepository;
  }
    @GetMapping("/finance_groups")
    public Iterable<FinanceGroup> getAllFinanceGroups() {
        return this.financeGroupRepository.findAll();
    }
    
    @GetMapping("/finance_groups/search")
    public FinanceGroup filterFinanceGroups(){
    // custom
    // filterFinanceGroups(filterArray[]): Group (?? data type)	
        //     Filters through the finance groups based on array specs
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @PostMapping("/finance_group_users/{user}")
    public FinanceGroup addUserToGroup(){
        // custom
        // addUserToGroup(user, group): bool
        //     Adds a specific user to a group
        //     OUTPUT: 
        return new FinanceGroup();
    }

    @DeleteMapping("/finance_group_users/{user}")
    public FinanceGroup removeUserFromGroup(){
        // custom
        // removeUserFromGroup(user, group): bool
        //     Removes a specific user from a group
        //     OUTPUT: success or not

        return new FinanceGroup();
    }

    @PostMapping("/finance_group")
    public FinanceGroup createGroup(@RequestBody FinanceGroup financeGroup){
        // createGroup(name): bool
        //     Creates a new finance group
        //     OUTPUT: new finance group
        return this.financeGroupRepository.save(financeGroup);
    }

    @PutMapping("/finance_group_{id}")
    public FinanceGroup removeGroup(@PathVariable("id") Integer id){
        // removeGroup(name): bool
        //     removes a group by its name
        //     OUTPUT: removed group
        Optional<FinanceGroup> finGroupToDeleteOptional = this.financeGroupRepository.findById(id);
        if (!finGroupToDeleteOptional.isPresent()){
            return null;
        }
        FinanceGroup deleteFinGroup = finGroupToDeleteOptional.get();
        deleteFinGroup.setDeleted(1);
        return this.financeGroupRepository.save(deleteFinGroup);
    }

}
