package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Persona;


public interface PersonaService {

	public abstract List<Persona> listar();
	public abstract Persona Agregar(Persona persona);
	
}
