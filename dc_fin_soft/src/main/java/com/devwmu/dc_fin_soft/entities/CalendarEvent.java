package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Calendar")
public class CalendarEvent {

    // initalization
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name ="event_name")
    private String event_name;

    @Column(name ="location")
    private String location;

    @Column(name ="start_date_time")
    private LocalDateTime start_date_time;

    @Column(name ="end_date_time")
    private LocalDateTime end_date_time;

    @Column(name ="creator")
    private String creator;

    @Column(name ="group_id")
    private String group_id;

    @Column(name ="category")
    private Integer category;

    @Column(name ="deleted")
    private Integer deleted;


    // getters
    public Integer getId(){
        return this.id;
    }

    public String getEventName(){
        return this.event_name;
    }

    public String getLocation(){
        return this.location;
    }

    public LocalDateTime getStateDateTime(){
        return this.start_date_time;
    }

    public LocalDateTime getEndDateTime(){
        return this.end_date_time;
    }

    public String getCreator(){
        return this.creator;
    }

    public String getGroupId(){
        return this.group_id;
    }

    public Integer getCategory(){
        return this.category;
    }

    public Integer getDeleted(){
        return this.deleted;
    }

    // setters

    public void setEventName(String event_name){
        this.event_name = event_name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setStateDateTime(LocalDateTime start_date_time){
        this.start_date_time = start_date_time;
    }

    public void setEndDateTime(LocalDateTime end_date_time){
        this.end_date_time = end_date_time;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public void setGroupId(String group_id){
        this.group_id = group_id;
    }

    public void setCategory(Integer category){
        this.category = category;
    }

    public void setDeleted(Integer deleted){
        this.deleted = deleted;
    }
}
