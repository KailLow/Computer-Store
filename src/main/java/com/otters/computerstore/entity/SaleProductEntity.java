package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class SaleProductEntity extends BaseEntity{
    private String productId;
    private String saleBillId;
    private Integer quantity;
    private Integer index;
    private Long price;
    private String unit;

    public SaleProductEntity(String productId, String saleBillId, Integer quantity, Integer index, Long price, String unit) {
        this.productId = productId;
        this.saleBillId = saleBillId;
        this.quantity = quantity;
        this.index = index;
        this.price = price;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "SaleProductEntity{" +
                "productId='" + productId + '\'' +
                ", saleBillId='" + saleBillId + '\'' +
                ", quantity=" + quantity +
                ", index=" + index +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
