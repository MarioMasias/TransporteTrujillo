package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Viaje;
import com.udemy.backendninja.Service.ModelForm.ViajeForm;

public interface ViajeService {
	public abstract List<Viaje> listAllViaje();
	public abstract Viaje addViaje(Viaje viaje);
	public abstract int removerViaje(Viaje viaje);
	public abstract Viaje actualizarViaje(Viaje viaje);
	public abstract ViajeForm agregarViaje(ViajeForm viaje);

}
