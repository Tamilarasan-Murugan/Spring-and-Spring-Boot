package com.example.FirstAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "You are logged in !";
    }
}
