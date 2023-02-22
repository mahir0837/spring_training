package com.sarac;

import com.sarac.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(PcConfig.class);
        PC mypc=container.getBean(PC.class);
        System.out.println(mypc.getTheCase().getDimensions().getWidth());
    }
}
