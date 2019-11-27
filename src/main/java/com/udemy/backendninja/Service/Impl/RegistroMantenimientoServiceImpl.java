package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Registro_Mantenimiento;
import com.udemy.backendninja.Repository.RegistroMantenimientoJPARepository;
import com.udemy.backendninja.Repository.Solicitud_MantenimientoJPARepository;
import com.udemy.backendninja.Service.RegistroMantenimientoService;

@Service("RegistroMantenimientoService")
public class RegistroMantenimientoServiceImpl  implements RegistroMantenimientoService{

	@Autowired
	@Qualifier ("RegistroMantenimientoJPARepository")
	private RegistroMantenimientoJPARepository regmanJPA;
	
	@Override
	public List<Registro_Mantenimiento> listar() {
		// TODO Auto-generated method stub
		return regmanJPA.findAll();
	}

	@Override
	public Registro_Mantenimiento agregar(Registro_Mantenimiento reg_man) {
		// TODO Auto-generated method stub
		return regmanJPA.save(reg_man);
	}
	
	
}
