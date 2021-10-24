package com.example.ejemplo.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ejemplo.services.ISaludo;

@Service
@Qualifier("castellano")
public class SaludoCastellanoImpl implements ISaludo{
	
	public String getSaludo() {		
		return "Hola!!!";
	}

}
