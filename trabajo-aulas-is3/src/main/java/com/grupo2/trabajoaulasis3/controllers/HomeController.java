package com.grupo2.trabajoaulasis3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grupo2.trabajoaulasis3.entities.Materia;
import com.grupo2.trabajoaulasis3.helper.ViewRouterHelper;
import com.grupo2.trabajoaulasis3.services.IAulaService;
import com.grupo2.trabajoaulasis3.services.IMateriaService;


@Controller
@RequestMapping("/inicio")
public class HomeController {
	
	@Autowired
	@Qualifier("materiaService")
    private IMateriaService materiaService;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		materiaService.asignarAulas();
		
		List<Materia> materiaLista = materiaService.findAll();
		
		model.addAttribute("titulo", "Lista de materias");
		model.addAttribute("materiaLista", materiaLista);
		
		return ViewRouterHelper.HOME_INDEX;
		
	}
	
	@GetMapping("/buscar")
    public String buscar(@RequestParam("id") int id, Model model) {
        Materia materia = materiaService.findByIdMateria(id);
        if (materia != null) {
            model.addAttribute("materia", materia);
            return "Materias.html"; 
        } else {
            model.addAttribute("error", "Materia no encontrada");
            return "Error.html"; // Vista de error
        }
    }
	
}
