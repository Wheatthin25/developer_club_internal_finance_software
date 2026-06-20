package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.FinanceGroup;
import org.springframework.data.jpa.domain.Specification;
import java.util.List;

public interface FinanceGroupRepository extends CrudRepository<FinanceGroup, Integer>, JpaSpecificationExecutor<FinanceGroup>{
    List<FinanceGroup> findByTitleContainingIgnoreCase(String title);
    
} 

