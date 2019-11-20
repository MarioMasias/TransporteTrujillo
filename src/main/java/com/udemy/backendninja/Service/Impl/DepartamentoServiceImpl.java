package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Departamento;
import com.udemy.backendninja.Repository.DepartamentoJPARepository;
import com.udemy.backendninja.Service.DepartamentoService;

@Service("DepartamentoService")
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	@Qualifier("departamentoJPARepository")
	private DepartamentoJPARepository departamentoJPARepository;

	@Override
	public List<Departamento> listar() {
		return departamentoJPARepository.findAll() ;
	}

}
