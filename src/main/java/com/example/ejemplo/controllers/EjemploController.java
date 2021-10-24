package com.example.ejemplo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemplo.services.IEjemploService;

@RestController
public class EjemploController {
	
	@Autowired
	IEjemploService ejemploService;
	
	@GetMapping("/{idioma}")
	public String index(@PathVariable String idioma) {
		return ejemploService.ejemploProcess(idioma);
	}
}
