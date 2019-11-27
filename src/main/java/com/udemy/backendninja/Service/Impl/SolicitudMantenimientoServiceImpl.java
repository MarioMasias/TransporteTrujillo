package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Solicitud_Mantenimiento;
import com.udemy.backendninja.Repository.Solicitud_MantenimientoJPARepository;
import com.udemy.backendninja.Service.SolicitudMantenimientoService;

@Service("SolicitudMantenimientoService")
public class SolicitudMantenimientoServiceImpl implements SolicitudMantenimientoService{
	@Autowired
	@Qualifier ("Solicitud_MantenimientoJPARespository")
	private Solicitud_MantenimientoJPARepository sol_manJPA;

	@Override
	public List<Solicitud_Mantenimiento> listar() {
		// TODO Auto-generated method stub
		return sol_manJPA.findAll();
	}

	@Override
	public Solicitud_Mantenimiento guardar(Solicitud_Mantenimiento sol_man) {
		// TODO Auto-generated method stub
		return sol_manJPA.save(sol_man);
	}


}
