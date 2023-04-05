package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String email;
    private String firstName;
    private String surName;
    private String userName;
    @OneToMany(mappedBy = "customer")
    private List<Payment> payment;

}
