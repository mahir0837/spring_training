package com.sarac.Enum;

import lombok.AllArgsConstructor;


public enum Gender {

    MALE("Male"),FEMALE("Female");
    final String value;

    Gender(String value) {
        this.value = value;
    }
}
