package com.otters.computerstore.config;

import com.otters.computerstore.repository.PermissionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PermissionConfig {
    @Bean
    CommandLineRunner commandLineRunnerPermission(PermissionRepo permissionRepo){
        return args -> {};
    }
}
