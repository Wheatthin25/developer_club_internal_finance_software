package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Expense;
public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

    
} 
