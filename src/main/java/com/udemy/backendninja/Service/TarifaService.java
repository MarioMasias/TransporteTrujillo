package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Tarifa;

public interface TarifaService {
	public abstract List<Tarifa> listar();
	public abstract Tarifa Agregar(Tarifa tarifa);
	public abstract Tarifa BuscarID(int id);

}
