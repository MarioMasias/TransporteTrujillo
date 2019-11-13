package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Bus;

public interface BusService {
	
	public abstract List<Bus> listar();
	public abstract Bus Agregar(Bus bus);

}
