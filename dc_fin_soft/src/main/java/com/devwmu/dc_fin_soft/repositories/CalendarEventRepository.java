package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.CalendarEvent;

public interface CalendarEventRepository extends CrudRepository<CalendarEvent, Integer>, JpaSpecificationExecutor<CalendarEvent> {
    
} 
