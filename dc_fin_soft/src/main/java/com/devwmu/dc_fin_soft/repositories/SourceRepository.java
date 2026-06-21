package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Source;
import java.util.List;
import java.math.BigDecimal;


public interface SourceRepository extends CrudRepository<Source, Integer>, JpaSpecificationExecutor<Source>{

    
} 