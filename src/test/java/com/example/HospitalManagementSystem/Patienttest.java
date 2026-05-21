package com.example.HospitalManagementSystem;

import com.example.HospitalManagementSystem.Entity.Patient;
import com.example.HospitalManagementSystem.respository.PatientData;
import com.example.HospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Patienttest {
    @Autowired
    private  PatientData patientData;
    @Test
    public void testPatientRepository(){
    List<Patient> patientList=patientData.findAll();
    System.out.println(patientList);
    }
    @Autowired
    private PatientService patientService;
    @Test

    public void testTransactionMethods(){
        Patient patient=patientService.getPatientId(1L);
    System.out.println(patient);
    }

}
