package com.grupo2.trabajoaulasis3.controllers;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grupo2.trabajoaulasis3.entities.*;
import com.grupo2.trabajoaulasis3.repositories.*;
import com.grupo2.trabajoaulasis3.services.IMateriaService;

@Controller
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	@Qualifier("materiaService")
    private IMateriaService materiaService;
	
	@Autowired
    private IMateriaRepository materiaRepository;

    @GetMapping("/{id}")
    public String mostrarMateria(@PathVariable int id, Model model) {
        Materia materia = materiaService.findByIdMateria(id);
        model.addAttribute("materia", materia);
        return "Materias.html"; // Nombre de la vista
    }
    
    @GetMapping("/buscar")
    public String buscarMaterias(
            @RequestParam(value = "nombre", required = false) String nombre,
            @RequestParam(value = "dia", required = false) String dia,
            @RequestParam(value = "horario", required = false) String horarioStr,
            @RequestParam(value = "edificio", required = false) String edificio,
            Model model) {

        LocalTime horario = null;
        if (horarioStr != null && !horarioStr.isEmpty()) {
            horario = LocalTime.parse(horarioStr);
        }

        List<Materia> materias;
        if (nombre == null && dia == null && horario == null && edificio == null) {
            // Si todos los parámetros son nulos o vacíos, buscar todas las materias
            materias = materiaRepository.findAll();
        } else {
            // Caso normal, buscar por criterios
            materias = materiaRepository.findByCriterios(nombre, dia, horario, edificio);
        }

        model.addAttribute("materias", materias);

        return "BusquedaMaterias.html"; // Nombre de la vista HTML que muestra los resultados
    }
 
}

