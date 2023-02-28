package com.sarac.controller;

import com.sarac.Enum.Gender;
import com.sarac.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MentorController {


    @RequestMapping("/mentor")
    public String getMentorObject(Model model){
        Mentor mentor1=new Mentor("Mike","Smith", Gender.MALE,45);
        Mentor mentor2=new Mentor("Tom","Hanks", Gender.MALE,65);
        Mentor mentor3=new Mentor("Ammy","Bryan", Gender.FEMALE,25);
        List<Mentor>mentorList=new ArrayList<>();
        mentorList.addAll(Arrays.asList(mentor1,mentor2,mentor3));
        model.addAttribute(mentorList);
        return "/mentor/mentor-list";
    }
}
