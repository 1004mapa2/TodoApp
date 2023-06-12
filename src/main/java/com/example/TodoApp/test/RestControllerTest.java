package com.example.TodoApp.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

    @GetMapping
    public String helloWorld() {
        return "To-do Application !";
    }
}
