package com.cydeo.controller;

import com.cydeo.dto.ResponseWrapper;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public ResponseEntity<ResponseWrapper>getAllCourses(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version","Cydeo_v3")
                .body(new ResponseWrapper("Courses successfully retrieving",
                        courseService.getCourses()
                ));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper>getCoursesById(@PathVariable("id")Long id){

        return ResponseEntity
                .ok(new ResponseWrapper(
                   "Course succesfully retrieve by id",
                        courseService.getCourseById(id)
                ));
    }

}
