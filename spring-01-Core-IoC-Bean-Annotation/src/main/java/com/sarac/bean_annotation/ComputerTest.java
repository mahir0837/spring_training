package com.sarac.bean_annotation;

import com.sarac.bean_annotation.caseFactory.Case;
import com.sarac.bean_annotation.caseFactory.DellCase;
import com.sarac.bean_annotation.config.ComputerConfig;
import com.sarac.bean_annotation.config.RandomConfig;
import com.sarac.bean_annotation.monitorfactory.Monitor;
import com.sarac.bean_annotation.monitorfactory.SonyMonitor;
import com.sarac.bean_annotation.motherboardfactory.AsusMotherboard;
import com.sarac.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        System.out.println("Creating Ccontainer");
        //Creating Container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);
        //Monitor monitor = container.getBean(Monitor.class);
        SonyMonitor sonyMonitor = container.getBean(SonyMonitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard motherboard = container.getBean(Motherboard.class);
        PC myPc = new PC(theCase, sonyMonitor, motherboard);
        myPc.powerUp();

        //Creating Container by using BeanFactory
        BeanFactory container1=new AnnotationConfigApplicationContext(ComputerConfig.class);
//        System.out.println("************Retrieving the beans****************");
//        Monitor theMonitor1=container1.getBean(Monitor.class);
//        Case theCase1=container1.getBean(Case.class);
//        Motherboard theMotherboard1=container1.getBean(Motherboard.class);

//        PC myPc1=new PC(theCase1,theMonitor1,theMotherboard1);
//        myPc1.powerUp();
        System.out.println("************Multiple Object****************");

        Monitor theMonitor2 = container1.getBean("monitorSony", Monitor.class); //DEFAULT BEAN NAME
        Case theCase1=container1.getBean(Case.class);
        Motherboard theMotherboard1=container1.getBean(Motherboard.class);
        PC myPc1=new PC(theCase1,theMonitor2,theMotherboard1);
        myPc1.powerUp();

        Monitor theMonitor3=container1.getBean("sony",Monitor.class);//Custom Bean Name

        Monitor theMonitor4=container1.getBean(Monitor.class);//@Primary
    }
}
