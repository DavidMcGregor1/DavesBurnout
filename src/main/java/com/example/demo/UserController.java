package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        return "Hello, User!";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "LoginPage";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "SignupPage";
    }
}
