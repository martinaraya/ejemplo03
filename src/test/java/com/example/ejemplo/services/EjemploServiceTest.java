package com.example.ejemplo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.ejemplo.services.impl.EjemploServiceImpl;
import com.example.ejemplo.services.impl.SaludoCastellanoImpl;
import com.example.ejemplo.services.impl.SaludoEnglishImpl;

public class EjemploServiceTest {

	@InjectMocks
	EjemploServiceImpl underTest;

	@BeforeEach
	void initMocks() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void ejemploProcessTest() {

		SaludoCastellanoImpl cas = Mockito.mock(SaludoCastellanoImpl.class);
		Mockito.when(cas.getSaludo()).thenReturn("¡Hola!");		
		SaludoEnglishImpl eng = Mockito.mock(SaludoEnglishImpl.class);
		Mockito.when(eng.getSaludo()).thenReturn("Hello!");
		
		underTest = new EjemploServiceImpl(cas, eng);
		String res = underTest.ejemploProcess("castellano");
		assertEquals("¡Hola!", res);
		res = underTest.ejemploProcess("english");
		assertEquals("Hello!", res);
		
	}

}
