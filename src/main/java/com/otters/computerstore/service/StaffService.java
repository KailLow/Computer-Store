package com.otters.computerstore.service;

import com.otters.computerstore.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    private final StaffRepo staffRepo;
    @Autowired
    public StaffService(StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }
}
