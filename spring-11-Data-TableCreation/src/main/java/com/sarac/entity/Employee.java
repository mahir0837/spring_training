package com.sarac.entity;

import com.sarac.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "employees")
    public class Employee extends BaseEntity {

        private String firstName;
        private String lastName;
        private String email;
        @Column(columnDefinition = "DATE")
        private LocalDate hireDate;
        @Enumerated(EnumType.STRING)
        private Gender gender;
        private int salary;
    }
