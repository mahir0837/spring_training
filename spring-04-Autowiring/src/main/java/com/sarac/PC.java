package com.sarac;

import com.sarac.casefactory.Case;
import com.sarac.casefactory.Dimensions;
import com.sarac.monitorfactory.Monitor;
import com.sarac.motherboardfactory.Motherboard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
//@AllArgsConstructor
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    @Autowired
    private Dimensions dimensions;

//    @Autowired Spring injection instead of us!!
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}