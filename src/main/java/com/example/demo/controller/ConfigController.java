package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingMessage;
    }
}