package com.example.ejemplo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ejemplo.services.IEjemploService;
import com.example.ejemplo.services.ISaludo;

@Service
public class EjemploServiceImpl implements IEjemploService {

	private ISaludo saludo1;

	private ISaludo saludo2;

	@Autowired
	public EjemploServiceImpl(@Qualifier("castellano") ISaludo saludo1,
			@Qualifier("english") ISaludo saludo2) {
		this.saludo1 = saludo1;
		this.saludo2 = saludo2;
	}

	public String ejemploProcess(String idioma) {
		switch (idioma) {
		case "castellano":
			return saludo1.getSaludo();
		case "english":
			return saludo2.getSaludo();
		default:
			return "idioma no soportado";
		}

	}

}
