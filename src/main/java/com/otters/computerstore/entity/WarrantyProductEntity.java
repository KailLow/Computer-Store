package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class WarrantyProductEntity extends NoteEntity{
    private String staffId;
    private String productId;
    private Integer quantity;
    private String warrantyContent;

    public WarrantyProductEntity(String note, String staffId, String productId, Integer quantity, String warrantyContent) {
        super(note);
        this.staffId = staffId;
        this.productId = productId;
        this.quantity = quantity;
        this.warrantyContent = warrantyContent;
    }

    @Override
    public String toString() {
        return "WarrantyProductEntity{" +
                "staffId='" + staffId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", warrantyContent='" + warrantyContent + '\'' +
                '}';
    }
}
