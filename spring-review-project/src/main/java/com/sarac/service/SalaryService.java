package com.sarac.service;

import com.sarac.repository.EmployeeRepository;
import com.sarac.repository.HoursRepository;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {
    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository, HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
