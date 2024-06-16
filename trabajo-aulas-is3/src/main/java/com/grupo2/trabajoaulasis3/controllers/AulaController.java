package com.grupo2.trabajoaulasis3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.services.IAulaService;

@Controller
@RequestMapping("/aula")
public class AulaController {
	@Autowired
	@Qualifier("aulaService")
    private IAulaService aulaService;
	
	@GetMapping("/{id}")
	public String mostrarAula(@PathVariable int id, Model model) {
		Aula aula = aulaService.findByIdAula(id);
		model.addAttribute("aula",aula);
		
		return "Aula.html";
	}
}
