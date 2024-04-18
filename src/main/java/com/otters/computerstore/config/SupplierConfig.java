package com.otters.computerstore.config;

import com.otters.computerstore.repository.SupplierRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SupplierConfig {
    CommandLineRunner commandLineRunnerSupplier(SupplierRepo supplierRepo) {
        return args -> {};
    }
}
