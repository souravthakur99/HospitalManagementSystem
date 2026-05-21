package com.example.HospitalManagementSystem.respository;

import com.example.HospitalManagementSystem.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance,Long> {
}
