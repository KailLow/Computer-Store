package com.otters.computerstore.controller;

import com.otters.computerstore.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "permission")
public class PermissionController {
    private final PermissionService permissionService;
    @Autowired
    public PermissionController(PermissionService permissionService){
        this.permissionService = permissionService;
    }
}
