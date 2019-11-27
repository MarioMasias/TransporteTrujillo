package com.udemy.backendninja.Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Tarifa;
import com.udemy.backendninja.Entity.Viaje;
import com.udemy.backendninja.Repository.TarifaJPARepository;
import com.udemy.backendninja.Service.TarifaService;
import com.udemy.backendninja.Service.ViajeService;
import com.udemy.backendninja.Service.ModelForm.TarifaForm;

@Service("TarifaService")
public class TarifaServiceImpl implements TarifaService{
	@Autowired
	@Qualifier("tarifaJPARepository")
	private TarifaJPARepository tarifaJPARepository;
	@Autowired
	@Qualifier("ViajeService")
	private ViajeService viajeService;

	@Override
	public List<Tarifa> listar() {
		return tarifaJPARepository.findAll();
	}

	@Override
	public Tarifa Agregar(Tarifa tarifa) {
		return tarifaJPARepository.save(tarifa);
	}

	@Override
	public Tarifa BuscarID(int id) {
		Tarifa tar= new Tarifa();
		tar=tarifaJPARepository.getOne(id);
		return tar;
	}

	@Override
	public List<TarifaForm> ViajeCosto() {
		List<Tarifa> Tarifas= tarifaJPARepository.findAll();
		List<Viaje> Viajes= viajeService.listAllViaje();
		List<TarifaForm>  TarifaCosto= new ArrayList<>();
		for(int i=0; i< Tarifas.size(); i++) {
			TarifaForm tar= new TarifaForm();
			for (int j=0; j< Viajes.size(); j++) {
				if(Viajes.get(j).getId_viaje()==Tarifas.get(i).getId_viaje()) {
					tar.setOrigen(Viajes.get(j).getOrigen());
					tar.setDestino(Viajes.get(j).getDestino());
					tar.setPrecio(Tarifas.get(i).getCosto());
					TarifaCosto.add(tar);
					j=Viajes.size();
					System.out.println(tar.toString());
				}
			}
		}
		return TarifaCosto;
	}
	

}
