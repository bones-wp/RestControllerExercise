package com.example.RestControllerExercise.controllers;

import com.example.RestControllerExercise.dto.StudentData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/student")
    public String helloStudent() {
        return "Hello, student!";
    }

    @RequestMapping(value  = "/greetings/{name}")
    public String greetingsByName(@PathVariable String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/student/submit")
    public String giveMeFeedbackAboutGrade(@RequestBody StudentData studentData) {
        return "You are greate with your grade " + studentData.getGrade();
    }
}
