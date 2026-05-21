package com.example.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime appointmentTime;
    @Column(length=500)
    private String reason;


    @ManyToOne
    @JoinColumn(name="patient_id",nullable = false)//owning side patient is required in appointment and cannot be nullable
    private Patient patient;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Doctor doctor;


}
