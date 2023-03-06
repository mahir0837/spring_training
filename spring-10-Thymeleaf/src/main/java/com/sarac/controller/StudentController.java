package com.sarac.controller;

import com.sarac.bootstrap.DataGenerator;
import com.sarac.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    //@RequestMapping("/register",method= RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "/student/register";
    }
//    @RequestMapping("/welcome",method=RequestMethod.POST)
    @PostMapping("/welcome")
    public String welcome(){


        return "student/welcome";
    }

}
