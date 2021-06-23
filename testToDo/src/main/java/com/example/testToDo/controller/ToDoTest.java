package com.example.testToDo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class ToDoTest {

    @GetMapping
    public String reponse(){
        return "Hello world";
    }
}
