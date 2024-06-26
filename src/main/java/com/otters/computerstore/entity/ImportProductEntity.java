package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class ImportProductEntity extends BaseEntity{
    private String productId;
    private Integer quantity;
    private Integer index;
    private Long price;
    private String unit;

    public ImportProductEntity(String productId, Integer quantity, Integer index, Long price, String unit) {
        this.productId = productId;
        this.quantity = quantity;
        this.index = index;
        this.price = price;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ImportProductEntity{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", index=" + index +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
