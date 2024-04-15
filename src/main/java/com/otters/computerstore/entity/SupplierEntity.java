package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class SupplierEntity extends NoteEntity{
    private String name;
    private String phone;
    private String email;
    private String address;

    public SupplierEntity(String note, String name, String phone, String email, String address) {
        super(note);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "SupplierEntity{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
