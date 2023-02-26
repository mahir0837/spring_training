package com.sarac;

import com.sarac.config.EmployeeConfig;
import com.sarac.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
       SalaryService salaryService= context.getBean(SalaryService.class);
       salaryService.calculateRegularSalary();
    }
}