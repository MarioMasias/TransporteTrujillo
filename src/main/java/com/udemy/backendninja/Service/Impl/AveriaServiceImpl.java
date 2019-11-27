package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Averia;
import com.udemy.backendninja.Repository.AveriaJPARepository;
import com.udemy.backendninja.Service.AveriaService;

@Service("AveriaService")
public class AveriaServiceImpl implements AveriaService{
	@Autowired
	@Qualifier ("averiaJPARespository")
	private AveriaJPARepository averiaJPARepository; 

	@Override
	public List<Averia> listAllAveria() {
		// TODO Auto-generated method stub
		return averiaJPARepository.findAll();
	}

	@Override
	public Averia addAveria(Averia averia) {
		// TODO Auto-generated method stub
		return averiaJPARepository.save(averia);
	}

	@Override
	public Averia obtenerAveria(int id) {
		Averia averia= new Averia();
		List<Averia> averias= averiaJPARepository.findAll();
		for (int i=0;i < averias.size(); i++) {
			if(averias.get(i).getId_averia()==id) {
				averia=averias.get(i);
				i=averias.size();
				}
		}
		return averia;
	}

}
