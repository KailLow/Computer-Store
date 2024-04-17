package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class WarrantyBillEntity extends BaseEntity{
    private String staffId;
    private String customerId;

    private Date warrantyDate;

    public WarrantyBillEntity(String staffId, String customerId, Date warrantyDate) {
        this.staffId = staffId;
        this.customerId = customerId;
        this.warrantyDate = warrantyDate;
    }

    @Override
    public String toString() {
        return "WarrantyBillEntity{" +
                "staffId='" + staffId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", warrantyDate=" + warrantyDate +
                '}';
    }
}
