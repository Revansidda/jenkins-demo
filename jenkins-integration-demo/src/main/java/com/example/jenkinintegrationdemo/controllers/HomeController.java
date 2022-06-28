package com.example.jenkinintegrationdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/api/v1/message")
    public String HomeMessage() {

        return "Welcome to jenkins test";
    }

}
