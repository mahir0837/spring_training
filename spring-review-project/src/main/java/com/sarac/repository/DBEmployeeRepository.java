package com.sarac.repository;

import com.sarac.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class DBEmployeeRepository implements EmployeeRepository{
    @Override
    public int getHourlyRate() {
       Employee employee=new Employee("Harold Finch","IT",65);
       return employee.getHourlyRate();
    }


}
