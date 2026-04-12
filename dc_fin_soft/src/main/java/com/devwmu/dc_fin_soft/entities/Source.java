package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Source")
public class Source {
        // initalization
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name ="name")
    private String name;

    @Column(name ="type")
    private String type;

    @Column(name ="internal")
    private String internal;

    @Column(name ="money_cap")
    private String money_cap;

    @Column(name ="spent")
    private Integer spent;

    @Column(name ="budgeted")
    private Integer budgeted;

    @Column(name ="available")
    private Integer available;

    @Column(name ="deleted")
    private Integer deleted;

    // getters

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getInternal() {
        return this.internal;
    }

    public String getMoneyCap() {
        return this.money_cap;
    }

    public Integer getSpent() {
        return this.spent;
    }

    public Integer getBudgeted() {
        return this.budgeted;
    }

    public Integer getAvailable() {
        return this.available;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public void setMoneyCap(String money_cap) {
        this.money_cap = money_cap;
    }

    public void setSpent(Integer spent) {
        this.spent = spent;
    }

    public void setBudgeted(Integer budgeted) {
        this.budgeted = budgeted;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    

}
