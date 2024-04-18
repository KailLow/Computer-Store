package com.otters.computerstore.repository;

import com.otters.computerstore.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<PermissionEntity, String> {
}
