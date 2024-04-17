package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class StaffEntity extends BaseEntity{
    private String name;
    private String phone;
    private String password;
    private String role;
    private String email;
    private String citizenId;


    public StaffEntity(String name, String phone, String password, String role, String email, String citizenId) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.email = email;
        this.citizenId = citizenId;
    }

    @Override
    public String toString() {
        return "StaffEntity{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", citizenId='" + citizenId + '\'' +
                '}';
    }
}
