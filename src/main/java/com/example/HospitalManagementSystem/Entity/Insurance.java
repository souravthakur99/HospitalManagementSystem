package com.example.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Insurance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique=true,length=50)
    private String policyNumber;
    @Column(nullable = false,length = 100)
    private String provider;
    @Column(nullable = false)
    private LocalDate validUntil;
    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private LocalDate createdAt;
    @OneToOne(mappedBy="insurance")
    private Patient patient;

}
