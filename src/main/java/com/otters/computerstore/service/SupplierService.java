package com.otters.computerstore.service;

import com.otters.computerstore.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    private final SupplierRepo supplierRepo;
    @Autowired
    public SupplierService(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }
}
