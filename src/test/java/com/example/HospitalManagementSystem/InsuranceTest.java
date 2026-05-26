package com.example.HospitalManagementSystem;

import com.example.HospitalManagementSystem.Entity.Appointment;
import com.example.HospitalManagementSystem.Entity.Insurance;
import com.example.HospitalManagementSystem.Entity.Patient;
import com.example.HospitalManagementSystem.respository.AppointmentRepository;
import com.example.HospitalManagementSystem.respository.PatientData;
import com.example.HospitalManagementSystem.service.AppointmentService;
import com.example.HospitalManagementSystem.service.InsuranceService;
import jakarta.transaction.Transactional;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {
    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testInsurance(){
    Insurance insurance= Insurance.builder().policyNumber("HDFC_1234").provider("HDFC").validUntil(LocalDate.of(2030,12,1)).build();
    Patient patient=insuranceService.assignInsuranceToPatient(insurance,1L);
    System.out.println(patient);
    var newpatient=insuranceService.disassociateInsurancefromPatient(patient.getId());
        System.out.println(patient);
    }
    @Autowired
    private AppointmentService appointmentService;
    @Test
    public void testCreateAppointment(){
        Appointment appointment=Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,6,21,6,0)).reason("cancer").build();
       var newAppointment= appointmentService.createNewAppointment(appointment,1l,1l);
        System.out.println(newAppointment);
        var updateAppointment=appointmentService.reAssignAppointmentToAnotherDoctor(newAppointment.getId(),2L);
        System.out.println(updateAppointment);
    }

    }


