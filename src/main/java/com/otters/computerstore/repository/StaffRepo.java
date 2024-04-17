package com.otters.computerstore.repository;

import com.otters.computerstore.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<StaffEntity, String> {
}
