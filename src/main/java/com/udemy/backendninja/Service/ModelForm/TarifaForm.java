package com.udemy.backendninja.Service.ModelForm;

public class TarifaForm {
	String Origen;
	String Destino;
	int precio;
	
	public TarifaForm() {
		
	}

	public TarifaForm(String origen, String destino, int precio) {
		super();
		Origen = origen;
		Destino = destino;
		this.precio = precio;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "TarifaForm [Origen=" + Origen + ", Destino=" + Destino + ", precio=" + precio + "]";
	}
	
	

}
