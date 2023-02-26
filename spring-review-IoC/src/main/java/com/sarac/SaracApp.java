package com.sarac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaracApp {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        FullTimeEmployee fullTimeEmployee=context.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee=context.getBean(PartTimeEmployee.class);
        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();
        System.out.println("-----------------------------------");
        ApplicationContext context1=new AnnotationConfigApplicationContext(NewAppConfig.class);
        String str1=context1.getBean("welcome",String.class);
        System.out.println("str1 = " + str1);
        String str2 = context1.getBean("str2", String.class);
        System.out.println("str2 = " + str2);

    }
}
