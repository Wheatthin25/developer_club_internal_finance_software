package com.devwmu.dc_fin_soft.entities;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "ClubRequests")
public class Request {
    
    // initalization
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name ="community_name")
    private Integer community_name;

    @Column(name ="requestee_user")
    private String requestee_user;

    @Column(name ="item_name")
    private String item_name;

    @Column(name ="approval")
    private Integer approval;

    @Column(name ="quantity")
    private Integer quantity;

    @Column(name ="price_per_unit")
    private BigDecimal price_per_unit;

    @Column(name ="deadline")
    private LocalDateTime deadline;

    @Column(name ="purpose")
    private String purpose;

    @Column(name ="deleted")
    private Integer deleted;

    // getters

    public Integer getId() {
        return this.id;
    }

    public Integer getCommunityName() {
        return this.community_name;
    }

    public String getRequesteeUser() {
        return this.requestee_user;
    }

    public String getItemName() {
        return this.item_name;
    }

    public Integer getApproval() {
        return this.approval;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public BigDecimal getPricePerUnit() {
        return this.price_per_unit;
    }

    public LocalDateTime getDeadline() {
        return this.deadline;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    // setters

    public void setCommunityName(Integer community_name) {
        this.community_name = community_name;
    }

    public void setRequesteeUser(String requestee_user) {
        this.requestee_user = requestee_user;
    }

    public void setItemName(String item_name) {
        this.item_name = item_name;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(BigDecimal price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }


    

}
