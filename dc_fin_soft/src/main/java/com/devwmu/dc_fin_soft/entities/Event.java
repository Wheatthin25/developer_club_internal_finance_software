package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Event")
public class Event {
        // initalization
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name ="name")
    private String name;

    @Column(name ="date")
    private String date;

    @Column(name ="location")
    private String location;

    @Column(name ="est_attendance")
    private Integer est_attendance;

    @Column(name ="fee_flag")
    private Integer fee_flag;

    @Column(name ="philanthropy_flag")
    private Integer philanthropy_flag;

    @Column(name ="conference_flag")
    private Integer conference_flag;

    @Column(name ="deleted")
    private Integer deleted;

    // getters

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public String getLocation() {
        return this.location;
    }

    public Integer getEstAttendance() {
        return this.est_attendance;
    }

    public Integer getFeeFlag() {
        return this.fee_flag;
    }

    public Integer getPhilanthropyFlag() {
        return this.philanthropy_flag;
    }

    public Integer getConferenceFlag() {
        return this.conference_flag;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEstAttendance(Integer est_attendance) {
        this.est_attendance = est_attendance;
    }

    public void setFeeFlag(Integer fee_flag) {
        this.fee_flag = fee_flag;
    }

    public void setPhilanthropyFlag(Integer philanthropy_flag) {
        this.philanthropy_flag = philanthropy_flag;
    }

    public void setConferenceFlag(Integer conference_flag) {
        this.conference_flag = conference_flag;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
