package com.example.myspringrestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
