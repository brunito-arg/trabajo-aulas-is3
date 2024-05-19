package com.grupo2.trabajoaulasis3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    
    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/inicio/home";
    }
}