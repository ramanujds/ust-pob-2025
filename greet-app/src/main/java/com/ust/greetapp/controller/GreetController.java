package com.ust.greetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping
    public String greet() {
        return "view.html";
    }

}
