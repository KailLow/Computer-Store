package com.otters.computerstore.service;

import com.otters.computerstore.repository.SaleBillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleBillService {
    private final SaleBillRepo saleBillRepo;
    @Autowired
    public SaleBillService(SaleBillRepo saleBillRepo){
        this.saleBillRepo = saleBillRepo;
    }
}