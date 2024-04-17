package com.otters.computerstore.config;

import com.otters.computerstore.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunnerProduct(ProductRepo productRepo){
        return args -> {};
    }
}
