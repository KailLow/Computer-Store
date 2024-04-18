package com.otters.computerstore.repository;

import com.otters.computerstore.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<SupplierEntity, String> {
}
