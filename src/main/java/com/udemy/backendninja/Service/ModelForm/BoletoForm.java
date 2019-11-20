package com.udemy.backendninja.Service.ModelForm;

public class BoletoForm {
	
	private int id_Bus;
	private String fecha;
	private String hora_partida;
	private int id_Viaje;
	private String nombre;
	private String apellido;
	private String DNI;
	private String telefono;
	
	public BoletoForm() {
		
	}

	public BoletoForm(int id_Bus, String fecha, String hora_partida, int id_Viaje, String nombre, String apellido,
			String dNI, String telefono) {
		super();
		this.id_Bus = id_Bus;
		this.fecha = fecha;
		this.hora_partida = hora_partida;
		this.id_Viaje = id_Viaje;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.telefono = telefono;
	}

	public int getId_Bus() {
		return id_Bus;
	}

	public void setId_Bus(int id_Bus) {
		this.id_Bus = id_Bus;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora_partida() {
		return hora_partida;
	}

	public void setHora_partida(String hora_partida) {
		this.hora_partida = hora_partida;
	}

	public int getId_Viaje() {
		return id_Viaje;
	}

	public void setId_Viaje(int id_Viaje) {
		this.id_Viaje = id_Viaje;
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "BoletoForm [id_Bus=" + id_Bus + ", fecha=" + fecha + ", hora_partida=" + hora_partida + ", id_Viaje="
				+ id_Viaje + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", telefono=" + telefono
				+ "]";
	}

}
