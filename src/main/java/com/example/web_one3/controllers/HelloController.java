package com.example.web_one3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }
    @GetMapping("/good")
    public String getGoodbye(){
        return "goodbye";
    }
}
