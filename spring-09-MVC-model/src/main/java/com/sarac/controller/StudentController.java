package com.sarac.controller;

import com.sarac.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        //Method Model Interface
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
        String subject="SpringBoot";
        model.addAttribute("subject",subject);
        int studentID=new Random().nextInt();
        model.addAttribute("studentID",studentID);
        List<Integer>number=new ArrayList<>();
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        model.addAttribute("numbers",number);
        LocalDate ld=LocalDate.now();
        model.addAttribute(ld);
        Student student=new Student(1,"Mike","Smitih");
        model.addAttribute("Student",student);
        return "/student/welcome";
    }
}
