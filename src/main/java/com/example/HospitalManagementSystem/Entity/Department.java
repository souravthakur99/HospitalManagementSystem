package com.example.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(nullable = false,unique = true,length=100)
   private String name;
   @OneToOne
    private Doctor headDoctor;
   @ManyToMany
   @JoinTable(name="Doctor_Dept_id",
   joinColumns = @JoinColumn(name="Dept_id"),
   inverseJoinColumns = @JoinColumn(name="Doctor_id"))

   private Set<Doctor> doctors=new HashSet<>();
}
