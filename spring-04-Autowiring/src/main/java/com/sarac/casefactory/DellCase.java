package com.sarac.casefactory;

import org.springframework.stereotype.Component;


@Component
public class DellCase extends Case {
    public DellCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        super(model, manufacturer, powerSupply, dimensions);
    }

//    public DellCase() {
//        super("2208","Dell","240");
//    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}