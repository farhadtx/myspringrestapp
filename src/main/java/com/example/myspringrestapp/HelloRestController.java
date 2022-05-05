package com.example.myspringrestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from my CI/CD pipeline";
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
    
    @GetMapping("/jenkins-pipeline-as-script")
    public String jenkinsPipeline(){
        return "Jenkins pipeline as script working";
    }

    @GetMapping("/demo")
    public String demo(){
        return "Hello-From-Demo";
    }
}
