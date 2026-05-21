package com.example.HospitalManagementSystem.respository;

import com.example.HospitalManagementSystem.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
