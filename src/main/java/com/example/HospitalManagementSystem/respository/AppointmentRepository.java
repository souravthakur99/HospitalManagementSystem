package com.example.HospitalManagementSystem.respository;

import com.example.HospitalManagementSystem.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
