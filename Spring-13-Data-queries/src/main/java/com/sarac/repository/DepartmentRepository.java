package com.sarac.repository;

import com.sarac.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all Departments in the furniture departments

    List<Department>findByDepartment(String departments);

    //Display all department in the Health Division

    List<Department>findByDivision(String division);
    List<Department>findByDivisionIs(String division);
    List<Department>findByDivisionEquals(String division);

    //Display all departments with division name ens with 'ics'
    List<Department>findByDivisionEndingWith(String division);

    //display top 3 departments with division name includes 'Hea' without duplicates
    List<Department>findDistinctTop3ByDivisionContains(String division);

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department>retrieveDepartmentDivision(List<String> division);



}
