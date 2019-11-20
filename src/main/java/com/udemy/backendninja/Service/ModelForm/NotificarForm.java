package com.udemy.backendninja.Service.ModelForm;

public class NotificarForm {

	String averia;
	int gradoaveria;
	int rangocosto;
	String detalle_averia;
	String fecha_registro;
	String nombre;
	String apellido;
	int id_bus;
	
	public NotificarForm() {
		
	}
	
	public NotificarForm(String averia, int gradoaveria, int rangocosto, String detalle_averia, String fecha_registro,
			String nombre, String apellido, int id_bus) {
		super();
		this.averia = averia;
		this.gradoaveria = gradoaveria;
		this.rangocosto = rangocosto;
		this.detalle_averia = detalle_averia;
		this.fecha_registro = fecha_registro;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_bus = id_bus;
	}
	public String getAveria() {
		return averia;
	}
	public void setAveria(String averia) {
		this.averia = averia;
	}
	public int getGradoaveria() {
		return gradoaveria;
	}
	public void setGradoaveria(int gradoaveria) {
		this.gradoaveria = gradoaveria;
	}
	public int getRangocosto() {
		return rangocosto;
	}
	public void setRangocosto(int rangocosto) {
		this.rangocosto = rangocosto;
	}
	public String getDetalle_averia() {
		return detalle_averia;
	}
	public void setDetalle_averia(String detalle_averia) {
		this.detalle_averia = detalle_averia;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId_bus() {
		return id_bus;
	}
	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}
	
	
	
	
}
