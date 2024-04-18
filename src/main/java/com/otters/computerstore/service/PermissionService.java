package com.otters.computerstore.service;

import com.otters.computerstore.repository.PermissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
    private final PermissionRepo permissionRepo;
    @Autowired
    public PermissionService(PermissionRepo permissionRepo) {
        this.permissionRepo = permissionRepo;
    }
}
