package com.otters.computerstore.config;

import com.otters.computerstore.repository.ImportBillRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportBillConfig {
    @Bean
    CommandLineRunner commandLineRunnerImportBill(ImportBillRepo importBillRepo){
        return args -> {};
    }
}
