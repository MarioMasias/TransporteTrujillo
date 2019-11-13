package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Bus;
import com.udemy.backendninja.Repository.BusJPARepository;
import com.udemy.backendninja.Service.BusService;

@Service("BusService")
public class BusServiceImpl implements BusService{
	@Autowired
	@Qualifier("busJPARepository")
	private BusJPARepository busJPARepository;
	
	@Override
	public List<Bus> listar() {
		return busJPARepository.findAll();
	}

	@Override
	public Bus Agregar(Bus bus) {
		return busJPARepository.save(bus);
	}

}
