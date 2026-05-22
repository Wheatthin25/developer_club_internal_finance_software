package com.devwmu.dc_fin_soft.entities;
import jakarta.persistence.*;
import java.math.BigDecimal;

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
    private Integer internal;

    @Column(name ="money_cap")
    private BigDecimal money_cap;

    @Column(name ="spent")
    private BigDecimal spent;

    @Column(name ="budgeted")
    private BigDecimal budgeted;

    @Column(name ="available")
    private BigDecimal available;

    @Column(name ="deleted")
    private Integer deleted;

    // getters

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public Integer getInternal() {
        return this.internal;
    }

    public BigDecimal getMoneyCap() {
        return this.money_cap;
    }

    public BigDecimal getSpent() {
        return this.spent;
    }

    public BigDecimal getBudgeted() {
        return this.budgeted;
    }

    public BigDecimal getAvailable() {
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

    public void setInternal(Integer internal) {
        this.internal = internal;
    }

    public void setMoneyCap(BigDecimal money_cap) {
        this.money_cap = money_cap;
    }

    public void setSpent(BigDecimal spent) {
        this.spent = spent;
    }

    public void setBudgeted(BigDecimal budgeted) {
        this.budgeted = budgeted;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    

}
