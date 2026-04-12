package com.devwmu.dc_fin_soft.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devwmu.dc_fin_soft.entities.Request;

public interface RequestRepository extends JpaRepository<Request, Integer> {
    
  public List<Request> findById();
}