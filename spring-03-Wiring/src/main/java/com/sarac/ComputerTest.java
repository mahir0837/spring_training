package com.sarac;

import com.sarac.Config.PcConfig;
import com.sarac.casefactory.Case;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(PcConfig.class);

       Case Thecase= container.getBean(Case.class);
        System.out.println(Thecase.getDimensions().getDepth());
        System.out.println(Thecase.getDimensions().getWidth());
    }
}
