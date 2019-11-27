package com.udemy.backendninja.Service.ModelForm;

public class PendienteForm {
	
	String placa;
	String estado;
	String fecha;
	String nombre_averia;
	String Detalle_averia;
	int numero_asientos;
	String grado_averia;
	String anio;
	
	public PendienteForm() {
		
	}
	
	public PendienteForm(String placa, String estado, String fecha, String nombre_averia, String detalle_averia,
			int numero_asientos, String grado_averia, String anio) {
		super();
		this.placa = placa;
		this.estado = estado;
		this.fecha = fecha;
		this.nombre_averia = nombre_averia;
		Detalle_averia = detalle_averia;
		this.numero_asientos = numero_asientos;
		this.grado_averia = grado_averia;
		this.anio = anio;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getNombre_averia() {
		return nombre_averia;
	}



	public void setNombre_averia(String nombre_averia) {
		this.nombre_averia = nombre_averia;
	}



	public String getDetalle_averia() {
		return Detalle_averia;
	}



	public void setDetalle_averia(String detalle_averia) {
		Detalle_averia = detalle_averia;
	}



	public int getNumero_asientos() {
		return numero_asientos;
	}



	public void setNumero_asientos(int numero_asientos) {
		this.numero_asientos = numero_asientos;
	}



	public String getGrado_averia() {
		return grado_averia;
	}



	public void setGrado_averia(String grado_averia) {
		this.grado_averia = grado_averia;
	}



	public String getAnio() {
		return anio;
	}



	public void setAnio(String anio) {
		this.anio = anio;
	}



	@Override
	public String toString() {
		return "PendienteForm [placa=" + placa + ", estado=" + estado + ", fecha=" + fecha + ", nombre_averia="
				+ nombre_averia + ", Detalle_averia=" + Detalle_averia + ", numero_asientos=" + numero_asientos
				+ ", grado_averia=" + grado_averia + ", anio=" + anio + "]";
	}
	
	
	

}
