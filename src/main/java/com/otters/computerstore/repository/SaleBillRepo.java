package com.otters.computerstore.repository;

import com.otters.computerstore.entity.SaleBillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleBillRepo extends JpaRepository<SaleBillEntity, String> {
}
