Features

* Patient Management
* Doctor Management
* Insurance Management
* Medical Records
* JPA Entity Relationships
    * One-to-One
    * One-to-Many
    * Many-to-Many
* Spring Data JPA
* Hibernate ORM
* MySQL Database Integration
* REST APIs
* Transaction Management
* Layered Architecture
    * Controller Layer
    * Service Layer
    * Repository Layer
* Exception Handling
Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* IntelliJ IDEA

  src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ com.example.HospitalManagementSystem
 ┃ ┃    ┣ Controller
 ┃ ┃    ┣ Service
 ┃ ┃    ┣ Repository
 ┃ ┃    ┣ Entity
 ┃ ┃    ┣ DTO
 ┃ ┃    ┗ Exception
 ┃ ┗ resources
 ┃    ┣ application.properties

JPA Mappings Implemented

One-to-One

* Patient ↔ MedicalRecord
* Patient ↔ Insurance

One-to-Many

* Doctor → Patients

Many-to-Many

* Patients ↔ Doctors
