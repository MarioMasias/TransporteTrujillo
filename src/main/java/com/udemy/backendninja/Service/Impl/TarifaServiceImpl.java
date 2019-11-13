package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Tarifa;
import com.udemy.backendninja.Repository.TarifaJPARepository;
import com.udemy.backendninja.Service.TarifaService;

@Service("TarifaService")
public class TarifaServiceImpl implements TarifaService{
	@Autowired
	@Qualifier("tarifaJPARepository")
	private TarifaJPARepository tarifaJPARepository;

	@Override
	public List<Tarifa> listar() {
		return tarifaJPARepository.findAll();
	}

	@Override
	public Tarifa Agregar(Tarifa tarifa) {
		return tarifaJPARepository.save(tarifa);
	}
	

}
