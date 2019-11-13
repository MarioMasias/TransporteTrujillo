package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Persona;
import com.udemy.backendninja.Repository.PersonaJPARepository;
import com.udemy.backendninja.Service.PersonaService;

@Service("PersonaService")
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	@Qualifier("personaJPARepository")
	private PersonaJPARepository PersonaJPA;

	@Override
	public List<Persona> listar() {
		
		//System.out.println(PersonaJPA.findAll()	);
		return PersonaJPA.findAll();
	}

	@Override
	public Persona Agregar(Persona persona) {
		PersonaJPA.save(persona);
		return null;
	}

}
