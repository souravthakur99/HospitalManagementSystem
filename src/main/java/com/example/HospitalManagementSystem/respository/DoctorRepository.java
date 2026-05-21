package com.example.HospitalManagementSystem.respository;

import com.example.HospitalManagementSystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
