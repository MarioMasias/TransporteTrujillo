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
	@Qualifier("busJPARespository")
	private BusJPARepository busJPARepository;
	
	@Override
	public List<Bus> listar() {
		return busJPARepository.findAll();
	}

	@Override
	public Bus Agregar(Bus bus) {
		return busJPARepository.save(bus);
	}

	@Override
	public Bus Obtener(int id) {
		// TODO Auto-generated method stub
		Bus b=new Bus();
		List<Bus> buses= busJPARepository.findAll();
		for(int i=0;i<buses.size();i++) {
			if(buses.get(i).getId()==id) {
				b=buses.get(i);
				i=buses.size();
			}
		}
		return b;
	}

}
