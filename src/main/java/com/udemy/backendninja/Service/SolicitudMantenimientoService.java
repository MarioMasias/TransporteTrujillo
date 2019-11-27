package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Solicitud_Mantenimiento;

public interface SolicitudMantenimientoService {
	public abstract List<Solicitud_Mantenimiento> listar();
	public abstract Solicitud_Mantenimiento guardar(Solicitud_Mantenimiento sol_man);

}
