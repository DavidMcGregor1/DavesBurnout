package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Home"; // This should match the name of your HTML file in the templates directory
    }

    @GetMapping("/menu")
    public String menu() {
        return "Menu"; // This should match the name of your HTML file in the templates directory
    }

    @GetMapping("/events")
    public String events() {
        return "Events"; // This should match the name of your HTML file in the templates directory
    }

    @GetMapping("/account")
    public String account() {
        return "Account"; // This should match the name of your HTML file in the templates directory
    }
}
