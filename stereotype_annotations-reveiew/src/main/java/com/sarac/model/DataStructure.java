package com.sarac.model;

import org.springframework.stereotype.Component;

@Component
public class DataStructure {

    private final ExtraHours extraHours;

    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }
    public  void getTotalHours(){

        System.out.println("Total Hours "+(35+extraHours.getHours()));
    }
}
