package com.example.HospitalManagementSystem;

import com.example.HospitalManagementSystem.Entity.Appointment;
import com.example.HospitalManagementSystem.respository.AppointmentRepository;
import com.example.HospitalManagementSystem.service.AppointmentService;
import jakarta.transaction.Transactional;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Test
    public void testInsurance(){

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


