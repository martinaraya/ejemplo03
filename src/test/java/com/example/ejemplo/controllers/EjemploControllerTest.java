package com.example.ejemplo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.ejemplo.services.impl.EjemploServiceImpl;

public class EjemploControllerTest {
	@InjectMocks
	EjemploController underTest;
	
	@Mock
	EjemploServiceImpl ejemploService;
	
	@BeforeEach
	void initMocks(){
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void indexTest(){
		Mockito.when(ejemploService.ejemploProcess("es")).thenReturn("test");
		String saludo =  underTest.index("es");
		assertEquals("test", saludo);
	}
	
}
