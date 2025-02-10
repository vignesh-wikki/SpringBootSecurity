package com.security.secureSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @RequestMapping("/welcome")
    public String greeting() {
        return "Welcome to the Spring Security !!";
    }

    @RequestMapping("/user")
    public String user() {
        return "Welcome to the Spring Security user page!!";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "Welcome to the Spring Security admin page!!";
    }
}
