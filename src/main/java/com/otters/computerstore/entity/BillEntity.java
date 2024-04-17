package com.otters.computerstore.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AutoCloseable.class)
public class BillEntity extends NoteEntity{
    public BillEntity(String note) {
        super(note);
    }
}
