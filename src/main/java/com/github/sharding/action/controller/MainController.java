package com.github.sharding.action.controller;

import com.github.sharding.action.service.StudentService;
import com.github.sharding.action.view.StudentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getStudent")
    public StudentView getStudent(@RequestParam("id") Integer id) {
        return studentService.getStudent(id);
    }
}
