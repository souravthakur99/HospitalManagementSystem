
package com.example.HospitalManagementSystem.Entity;

import com.example.HospitalManagementSystem.Entity.type.BloodGroup;
import jakarta.persistence.*;

import lombok.*;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.util.List;

@Table(
    name="patient ",
    uniqueConstraints={@UniqueConstraint(name="Uniqueconstraintemail",columnNames = {"email"}),
    @UniqueConstraint(name="uniqueconstraintnamebirthdate",columnNames = {"name","birthdate"})
    }
)



@Entity
@Getter
@Setter
@ToString
public class Patient {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ToString.Exclude
    private LocalDate birthdate;
    private String email;
    private String gender;
    @Enumerated(EnumType.STRING)
    private BloodGroup blood_group;
    @OneToOne
    @JoinColumn(name="Patient_Insurance_Id")
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    @ToString.Exclude
    private List<Appointment> appointments;
}
