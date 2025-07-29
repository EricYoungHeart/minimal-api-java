package ru.petsinbloom.minapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Say Hello", description = "Returns a friendly greeting message")
    public String sayHello() {
        return "Hello, bro! 👋 This is your first minimal API endpoint!";
    }
}
