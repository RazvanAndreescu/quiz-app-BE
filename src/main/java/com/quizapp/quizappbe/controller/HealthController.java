package com.quizapp.quizappbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/health-check")
    public String healthCheck(){
        return "All good here!";
    }
}
