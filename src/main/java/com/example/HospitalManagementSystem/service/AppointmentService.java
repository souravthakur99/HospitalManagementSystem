package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.Entity.Appointment;
import com.example.HospitalManagementSystem.Entity.Doctor;
import com.example.HospitalManagementSystem.Entity.Patient;
import com.example.HospitalManagementSystem.respository.AppointmentRepository;
import com.example.HospitalManagementSystem.respository.DoctorRepository;
import com.example.HospitalManagementSystem.respository.InsuranceRepository;
import com.example.HospitalManagementSystem.respository.PatientData;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientData patientRepository;
    private final DoctorRepository doctorRepository;
    private final InsuranceRepository insuranceRepository;
    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long patient_id, Long doctor_id){
        Doctor doctor=doctorRepository.findById(doctor_id).orElseThrow();
        Patient patient=patientRepository.findById(patient_id).orElseThrow();
        if(appointment.getId()!=null)throw new IllegalArgumentException("appointment should not have id");
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        patient.getAppointments().add(appointment);//bidirectional mapping

        return appointmentRepository.save(appointment);
    }
    @Transactional
    public Appointment reAssignAppointmentToAnotherDoctor(Long appointment_id,Long doctor_id){
        Appointment appointment=appointmentRepository.findById(appointment_id).orElseThrow();
        Doctor doctor=doctorRepository.findById(doctor_id).orElseThrow();
        appointment.setDoctor(doctor);
        return appointment;
    }

}
