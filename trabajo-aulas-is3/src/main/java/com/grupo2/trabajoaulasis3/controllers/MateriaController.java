package com.grupo2.trabajoaulasis3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo2.trabajoaulasis3.entities.*;
import com.grupo2.trabajoaulasis3.repositories.*;
import com.grupo2.trabajoaulasis3.services.IMateriaService;

@Controller
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	@Qualifier("materiaService")
    private IMateriaService materiaService;

    @GetMapping("/{id}")
    public String mostrarMateria(@PathVariable int id, Model model) {
        Materia materia = materiaService.findByIdMateria(id);
        model.addAttribute("materia", materia);
        return "Materias.html"; // Nombre de la vista
    }
    
 
}

