package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Tarifa;
import com.udemy.backendninja.Entity.Viaje;
import com.udemy.backendninja.Repository.ViajeJPARepository;
import com.udemy.backendninja.Service.TarifaService;
import com.udemy.backendninja.Service.ViajeService;
import com.udemy.backendninja.Service.ModelForm.ViajeForm;

@Service("ViajeService")
public class ViajeServiceImpl implements ViajeService{
	
	@Autowired
	@Qualifier("viajeJPARepository")
	private ViajeJPARepository viajeJPA;
	
	@Autowired
	@Qualifier("TarifaService")
	private TarifaService tarifaService;

	@Override
	public List<Viaje> listAllViaje() {
		return viajeJPA.findAll();
	}

	@Override
	public Viaje addViaje(Viaje viaje) {
		return viajeJPA.save(viaje);
	}

	@Override
	public int removerViaje(Viaje viaje) {
		viajeJPA.delete(viaje);
		return 0;
	}

	@Override
	public Viaje actualizarViaje(Viaje viaje) {
		viajeJPA.save(viaje);
		return null;
	}

	@Override
	public ViajeForm agregarViaje(ViajeForm viaje) {
		Viaje v1= new Viaje();
		Viaje v2= new Viaje();
		v1.setDestino(viaje.getDestino());
		v1.setOrigen(viaje.getOrigen());
		v2=viajeJPA.save(v1);
		Tarifa tar1= new Tarifa();
		tar1.setId_viaje(v2.getId_viaje());
		tar1.setCosto(viaje.getCosto());
		tarifaService.Agregar(tar1);
		System.out.println("Agregados correctamente--> Tarifa y Viaje");
		return null;
	}

}
