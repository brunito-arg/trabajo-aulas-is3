package com.grupo2.trabajoaulasis3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo2.trabajoaulasis3.entities.Materia;
import com.grupo2.trabajoaulasis3.services.IMateriaService;

import com.grupo2.trabajosaulasis3.helper.ViewRouterHelper;


@Controller
@RequestMapping("/inicio")
public class HomeController {
	
	@Autowired
	@Qualifier("materiaService")
    private IMateriaService materiaService;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Materia> materiaLista = materiaService.findAll();
		List<Materia> lista = new ArrayList<Materia>();
		
		
		model.addAttribute("titulo", "Lista de materias");
		model.addAttribute("lista", materiaLista);
		
		return ViewRouterHelper.HOME_INDEX;
		
	}
}
