package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Tarifa;
import com.udemy.backendninja.Service.ModelForm.TarifaForm;

public interface TarifaService {
	public abstract List<Tarifa> listar();
	public abstract Tarifa Agregar(Tarifa tarifa);
	public abstract Tarifa BuscarID(int id);
	public abstract List<TarifaForm> ViajeCosto();

}
