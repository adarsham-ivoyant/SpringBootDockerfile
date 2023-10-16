package com.example.springDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String display(){
        return "Welcome to DOCKERFILE Project";
    }
}
