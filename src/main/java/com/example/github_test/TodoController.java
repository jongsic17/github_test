package com.example.github_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String hellowrld(){
        return "To-do Application !";
    }
}
