package com.example.HospitalManagementSystem.respository;

import com.example.HospitalManagementSystem.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientData extends JpaRepository<Patient,Long > {

}
