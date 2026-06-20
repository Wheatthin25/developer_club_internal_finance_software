package com.devwmu.dc_fin_soft.controllers.specifications;
import org.springframework.data.jpa.domain.Specification;
import com.devwmu.dc_fin_soft.entities.*;

public class FinanceGroupSpecification {
    
    public static Specification<FinanceGroup> hasid (Integer id){
        return (root, query, criteraBuilder) -> 
            criteraBuilder.equal(root.get("id"), id);
    }

    public static Specification<FinanceGroup> likeTitle (String title){
        String lower = "%" + title.toLowerCase() + "%";
        return (root, query, criteraBuilder) ->
            criteraBuilder.like(criteraBuilder.lower(root.get("title")), lower);
    }

    public static Specification<FinanceGroup> isDeleted (Integer deleted) {
        return (root, query, criteraBuilder) -> 
            criteraBuilder.equal(root.get("deleted"), deleted);
    }
}
