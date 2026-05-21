package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.Entity.Patient;
import com.example.HospitalManagementSystem.respository.PatientData;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientData patientData;
    @Transactional
    public Patient getPatientId(Long id){
       Patient p1= patientData.findById(id).orElseThrow();
       Patient p2= patientData.findById(id).orElseThrow();
       return p1;
    }

}
