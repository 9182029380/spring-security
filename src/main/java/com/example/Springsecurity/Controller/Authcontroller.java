package com.example.Springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Authcontroller {
    @GetMapping("/home")
    public String home() {
        return "Welcome to home page";
    }
}
