package com.devwmu.dc_fin_soft.controllers;
import org.springframework.data.jpa.domain.Specification;
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
    
    @PutMapping("/finance_groups/search")
    public Iterable<FinanceGroup> filterFinanceGroups(@RequestBody Filter[] filters){
    // custom
    // filterFinanceGroups(filterArray[]): Group (?? data type)	
        //     Filters through the finance groups based on array specs
        //     OUTPUT: success or not

        // id: equality
        // title: contains
        // deleted: equality
    
        // returns the events that match
        Specification<FinanceGroup> spec = Specification.unrestricted();
        for (Filter filter: filters){
            String col = filter.getCol();
            String op = filter.getOp().toLowerCase();
            Object value = filter.getVal();

            if (value == null){
                continue;
            }

            Specification<FinanceGroup> condition = null;
            switch (op) {
                case "like":
                    try{
                        String lower = "%" + value.toString().toLowerCase() + "%";
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.like(criteraBuilder.lower(root.get(col)), lower);
                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "eq":
                    condition = (root, query, criteriaBuilder) -> 
                        criteriaBuilder.equal(root.get(col), value);
                    break;
            }
            
            if (condition != null){
                spec = spec.and(condition);
            }

        }
        return this.financeGroupRepository.findAll(spec);
    }

    @PutMapping("/finance_group_users/add_{user}")
    public FinanceGroup addUserToGroup(){
        // custom
        // addUserToGroup(user, group): bool
        //     Adds a specific user to a group
        //     OUTPUT: 

        // modify finGroup column of users table - will have to add finGroup col to do this
        // return updated user
        return new FinanceGroup();
    }

    @PutMapping("/finance_group_users/remove_{user}")
    public FinanceGroup removeUserFromGroup(){
        // custom
        // removeUserFromGroup(user, group): bool
        //     Removes a specific user from a group
        //     OUTPUT: success or not

        // modify finGroup column of users table - will have to add finGroup col to do this
        // return updated user
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
