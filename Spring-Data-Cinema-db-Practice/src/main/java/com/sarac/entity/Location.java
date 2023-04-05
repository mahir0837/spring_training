package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer latitude;
    private Integer longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;
    @OneToMany(mappedBy = "location")
    private List<Cinema> cinema;

    public Location(String name, String country, String city, String state, String postalCode, String address) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.address = address;
    }
}
