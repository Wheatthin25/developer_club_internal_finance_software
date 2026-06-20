package com.devwmu.dc_fin_soft.repositories;
import org.springframework.data.repository.CrudRepository;
import com.devwmu.dc_fin_soft.entities.Event;
import java.util.List;
import java.time.LocalDateTime;

public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findByNameContainingIgnoreCase(String name);
    List<Event> findByDateBetween(LocalDateTime date1, LocalDateTime date2);
    List<Event> findByLocationContainingIgnoreCase(String location);
    List<Event> findByEstAttendanceLessThanEqual(Integer estAttendance);
    List<Event> findByEstAttendanceGreaterThanEqual(Integer estAttendance);
    
} 