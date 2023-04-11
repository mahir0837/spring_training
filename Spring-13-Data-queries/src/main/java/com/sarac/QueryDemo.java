package com.sarac;



import com.sarac.repository.DepartmentRepository;
import com.sarac.repository.EmployeeRepository;
import com.sarac.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------REGIONS-------------");

        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));

        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));

        System.out.println("findByCountryContainsOrderByRegionDesc: " + regionRepository.findByCountryContainsOrderByRegionDesc("United"));

        System.out.println("findTop2ByCountry: " + regionRepository.findTop2ByCountry("United States"));

        System.out.println("findTopByCountryContainsOrderByRegion: " + regionRepository.findTopByCountryContainsOrderByRegion("United"));

        System.out.println("-------------DEPARTMENT-------------");

        System.out.println("findByDepartment: "+departmentRepository.findByDepartment("Furniture"));

        System.out.println("findByDivision: "+departmentRepository.findByDivision("Health"));

        System.out.println("findByDivisionEndingWith: "+departmentRepository.findByDivisionEndingWith("ics"));

        System.out.println("findDistinctTopByDivisionContains: "+departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("-------------EMPLOYEE-------------");

        System.out.println(employeeRepository.retrieveEmployeeDetail());


    }
}
