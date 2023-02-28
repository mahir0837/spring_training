package com.sarac.model;

import com.sarac.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
}
