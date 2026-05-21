package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.Entity.Insurance;
import com.example.HospitalManagementSystem.Entity.Patient;
import com.example.HospitalManagementSystem.respository.InsuranceRepository;
import com.example.HospitalManagementSystem.respository.PatientData;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InsuranceService {
    private final PatientData patientData;
    private final InsuranceRepository insuranceRepository;
    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance,Long patientId){
       Patient patient= patientData.findById(patientId).orElseThrow(()->new EntityNotFoundException("Patient of this id is not found"));
       patient.setInsurance(insurance);
       insurance.setPatient(patient);//bidirectional consistency maintenance
        return patient;
    }
}
