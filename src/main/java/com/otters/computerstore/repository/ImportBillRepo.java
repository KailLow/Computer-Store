package com.otters.computerstore.repository;

import com.otters.computerstore.entity.ImportBillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportBillRepo extends JpaRepository<ImportBillEntity, String> {
}
