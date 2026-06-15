package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.FinanceGroup;
import java.util.List;

public interface FinanceGroupRepository extends CrudRepository<FinanceGroup, Integer> {
    List<FinanceGroup> findByTitleContainingIgnoreCase(String title);
    
} 

