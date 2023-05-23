package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v2")
public class CourseController_ResponseEntity {
    private final CourseService courseService;

    public CourseController_ResponseEntity(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version","cydeo V2")
                .header("Operation","Get")
                .body(courseService.getCourses());
    }
    @GetMapping("{id}")
    public ResponseEntity<CourseDTO>getCourseById(@PathVariable("id")Long id){

        return ResponseEntity.ok(courseService.getCourseById(id));
    }
    @GetMapping("category/{name}")
    public ResponseEntity<List<CourseDTO>>getCourseByCategory(@PathVariable("name")String name){

        return ResponseEntity.ok(courseService.getCoursesByCategory(name));
    }

    @PostMapping
    public ResponseEntity<CourseDTO>createCourse(@RequestBody CourseDTO course){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Operation","Create")
                .body(courseService.createCourse(course));
    }
}
