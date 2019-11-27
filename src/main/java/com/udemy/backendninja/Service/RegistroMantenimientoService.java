package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Registro_Mantenimiento;

public interface RegistroMantenimientoService {
	
	public abstract List<Registro_Mantenimiento> listar();
	public abstract Registro_Mantenimiento agregar(Registro_Mantenimiento reg_man);

}
