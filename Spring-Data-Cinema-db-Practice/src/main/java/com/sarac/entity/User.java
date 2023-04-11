package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_account")
public class User extends BasedEntity {

    private String email;
    private String password;
    private String username;
    @OneToOne
    private Account accountDetails;



}
