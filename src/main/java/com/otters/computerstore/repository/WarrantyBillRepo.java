package com.otters.computerstore.repository;

import com.otters.computerstore.entity.WarrantyBillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarrantyBillRepo extends JpaRepository<WarrantyBillEntity, String> {
}
