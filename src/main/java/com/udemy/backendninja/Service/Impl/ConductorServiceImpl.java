package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Conductor;
import com.udemy.backendninja.Repository.ConductorJPARepository;
import com.udemy.backendninja.Service.ConductorService;

@Service("ConductorService")
public class ConductorServiceImpl implements ConductorService{
	
	@Autowired
	@Qualifier ("conductorJPARespository")
	private ConductorJPARepository conductorJPARepository;

	@Override
	public List<Conductor> listarConductor() {
		return conductorJPARepository.findAll();
	}

	@Override
	public Conductor addConductor(Conductor conductor) {
		return conductorJPARepository.save(conductor);
	}

}
