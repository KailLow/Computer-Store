package com.otters.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter

@Setter
public class PermissionEntity extends NoteEntity{
    private String name;
    private String phone;
    private String username;
    private String password;
    private String role;
    private String email;
    private String citizenId;

    public PermissionEntity(String note, String name, String phone, String username, String password, String role, String email, String citizenId) {
        super(note);
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.citizenId = citizenId;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", citizenId='" + citizenId + '\'' +
                '}';
    }
}
