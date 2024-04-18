package com.otters.computerstore.controller;

import com.otters.computerstore.service.WarrantyBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "warranty bill")
public class WarrantyBillController {
    private final WarrantyBillService warrantyBillService;
    @Autowired
    public WarrantyBillController(WarrantyBillService warrantyBillService){
        this.warrantyBillService = warrantyBillService;
    }
}
