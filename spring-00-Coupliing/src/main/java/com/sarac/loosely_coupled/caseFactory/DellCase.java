package com.sarac.loosely_coupled.caseFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}