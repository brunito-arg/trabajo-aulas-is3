package com.grupo2.trabajoaulasis3.controllers;

import java.time.LocalTime;
import java.util.List;

import com.grupo2.trabajoaulasis3.repositories.IMateriaRepository;
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
    @Autowired
    private IMateriaRepository materiaRepository;
	
	
	@GetMapping("/home")
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
            materias = materiaRepository.findByCriterios(
                    nombre != null && nombre.isEmpty() ? null : nombre,
                    dia != null && dia.isEmpty() ? null : dia,
                    horario,
                    edificio != null && edificio.isEmpty() ? null : edificio);
        }

        model.addAttribute("materias", materias);

        return "BusquedaMaterias";
    }
}
