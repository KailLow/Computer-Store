package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter

@Setter
public class PermissionEntity extends BaseEntity{
    private String name;
    private String description;

    public PermissionEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "name='" + name + '\'' +
                ", phone='" + description + '\'' +
                '}';
    }
}
