package com.grupo2.trabajoaulasis3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class HomeController {
	
	@GetMapping("Home")
	public String home() {
		return "Home";
		
	}
}
