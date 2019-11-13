package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Boleto;
import com.udemy.backendninja.Service.ModelForm.BoletoForm;

public interface BoletoService {
	public abstract List<Boleto> listar();
	public abstract Boleto Agregar(Boleto boleto);
	public abstract int Agregar1(BoletoForm boleto);
}
