package com.cydeo.controller;

import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.StudentDTO;
import com.cydeo.dto.TeacherDTO;
import com.cydeo.service.AddressService;
import com.cydeo.service.ParentService;
import com.cydeo.service.StudentService;
import com.cydeo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    ParentService parentService;
    @Autowired
    AddressService addressService;

    @GetMapping("/teachers")
    public ResponseEntity<List<TeacherDTO>>getAllTeachers(){
      return ResponseEntity.ok(teacherService.findAll());
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper>getAllStudents(){

    return ResponseEntity.ok(new ResponseWrapper(
      "Students are successfully retrieved",studentService.findAll()
    ));
    }
    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper>getAllParents(){
        ResponseWrapper responseWrapper=new ResponseWrapper(
               true, "Parents are successfully retrieved",
                HttpStatus.ACCEPTED.value(), parentService.findAll()
        );
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Parent","Returned")
                .body(responseWrapper);

    }
    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper>getAddressByID(@PathVariable("id")Long id) throws Exception {
        return ResponseEntity.ok(new ResponseWrapper(
             "address " +id +" is successfully retreived",addressService.findById(id)
        ));
    }
}
