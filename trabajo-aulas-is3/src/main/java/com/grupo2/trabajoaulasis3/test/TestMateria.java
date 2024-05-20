package com.grupo2.trabajoaulasis3.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.grupo2.trabajoaulasis3.services.IMateriaService;


import com.grupo2.trabajoaulasis3.entities.Materia;

public class TestMateria {

	
	   @Autowired
	    @Qualifier("materiaService")
	   private IMateriaService materiaService;
	
	   public void testFindAllMaterias() {
	        List<Materia> materiaLista = materiaService.findAll();
	       
	       System.out.println(materiaLista);
	    }
	
	
	
}
