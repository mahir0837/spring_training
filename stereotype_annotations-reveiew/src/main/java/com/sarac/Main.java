package com.sarac;

import com.sarac.config.appConfig;
import com.sarac.model.DataStructure;
import com.sarac.model.Devops;
import com.sarac.model.MikroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(appConfig.class);
        Devops devops=context.getBean(Devops.class);
        devops.getTotalHours();
        MikroService mikroService=context.getBean(MikroService.class);
        mikroService.totalHours();
        DataStructure dataStructure=context.getBean(DataStructure.class);
        dataStructure.getTotalHours();
    }
}