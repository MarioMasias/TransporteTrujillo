package com.udemy.backendninja.Service.ModelForm;

public class ViajeForm {
	String Origen;
	String Destino;
	private int costo;
	

	public ViajeForm(){
		
	}


	public ViajeForm(String origen, String destino, int costo) {
		super();
		Origen = origen;
		Destino = destino;
		this.costo = costo;
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


	public int getCosto() {
		return costo;
	}


	public void setCosto(int costo) {
		this.costo = costo;
	}


	@Override
	public String toString() {
		return "ViajeForm [Origen=" + Origen + ", Destino=" + Destino + ", costo=" + costo + "]";
	}
	
	
}
