package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Source;
import java.util.List;
import java.math.BigDecimal;


public interface SourceRepository extends CrudRepository<Source, Integer> {
    List<Source> findByNameContainingIgnoreCase(String name);
    List<Source> findByTypeContainingIgnoreCase(String type);
    List<Source> findByMoneyCapLessThanEqual(BigDecimal moneyCap);
    List<Source> findByMoneyCapGreaterThanEqual(BigDecimal moneyCap);
    List<Source> findBySpentLessThanEqual(BigDecimal spent);
    List<Source> findBySpentGreaterThanEqual(BigDecimal spent);
    
} 