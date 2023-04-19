package com.salesianos.triana.dam.manytoone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianos.triana.dam.manytoone.repository.DeporteRepositorio;
import com.salesianos.triana.dam.manytoone.repository.PistaRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {

	@Autowired
	private final DeporteRepositorio deporteRepositorio;
	private final PistaRepositorio pistaRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		
	}
}
