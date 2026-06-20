package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Request;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;



public interface RequestRepository extends CrudRepository<Request, Integer> {
    List<Request> findByCommunityNameContainingIgnoreCase(Integer communityName);
    List<Request> findByRequesteeUserContainingIgnoreCase(String requesteeUser);
    List<Request> findByItemNameContainingIgnoreCase(String itemName);
    List<Request> findByQuantityLessThanEqual(Integer quantity);
    List<Request> findByQuantityGreaterThanEqual(Integer quantity);
    List<Request> findByPricePerUnitLessThanEqual(BigDecimal pricePerUnit);
    List<Request> findByPricePerUnitGreaterThanEqual(BigDecimal pricePerUnit);
    List<Request> findByDeadlineBetween(LocalDateTime date1, LocalDateTime date2);
    List<Request> findByPurposeContainingIgnoreCase(String purpose);
} 