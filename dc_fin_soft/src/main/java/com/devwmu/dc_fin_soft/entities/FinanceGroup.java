package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "FinanceGroup")
public class FinanceGroup {
        // initalization
    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Integer id;

    @Column(name ="title")
    private String title;

    @Column(name ="deleted")
    private Integer deleted;


    // getters
    public Integer getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public Integer getDeleted(){
        return this.deleted;
    }

    // setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setDeleted(Integer deleted){
        this.deleted = deleted;
    }
}
