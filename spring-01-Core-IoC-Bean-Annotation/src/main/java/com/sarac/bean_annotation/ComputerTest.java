package com.sarac.bean_annotation;

import com.sarac.bean_annotation.caseFactory.Case;
import com.sarac.bean_annotation.config.ComputerConfig;
import com.sarac.bean_annotation.config.RandomConfig;
import com.sarac.bean_annotation.monitorfactory.Monitor;
import com.sarac.bean_annotation.monitorfactory.SonyMonitor;
import com.sarac.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);
        //Monitor monitor = container.getBean(Monitor.class);

        SonyMonitor sonyMonitor = container.getBean(SonyMonitor.class);

        Case theCase = container.getBean(Case.class);

        Motherboard motherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, sonyMonitor, motherboard);
        myPc.powerUp();
    }
}
