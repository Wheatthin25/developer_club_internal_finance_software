package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;

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
    private String start_date_time;

    @Column(name ="end_date_time")
    private String end_date_time;

    @Column(name ="creator")
    private Integer creator;

    @Column(name ="group_id")
    private Integer group_id;

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

    public String getStateDateTime(){
        return this.start_date_time;
    }

    public String getEndDateTime(){
        return this.end_date_time;
    }

    public Integer getCreator(){
        return this.creator;
    }

    public Integer getGroupId(){
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

    public void setStateDateTime(String start_date_time){
        this.start_date_time = start_date_time;
    }

    public void setEndDateTime(String end_date_time){
        this.end_date_time = end_date_time;
    }

    public void setCreator(Integer creator){
        this.creator = creator;
    }

    public void setGroupId(Integer group_id){
        this.group_id = group_id;
    }

    public void setCategory(Integer category){
        this.category = category;
    }

    public void setDeleted(Integer deleted){
        this.deleted = deleted;
    }
}
