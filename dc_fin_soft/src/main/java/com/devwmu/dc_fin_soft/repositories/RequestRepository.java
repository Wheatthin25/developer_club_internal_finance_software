package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Request;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;



public interface RequestRepository extends CrudRepository<Request, Integer>, JpaSpecificationExecutor<Request> {

} 