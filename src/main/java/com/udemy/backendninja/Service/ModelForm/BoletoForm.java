package com.udemy.backendninja.Service.ModelForm;

public class BoletoForm {
	
	private String modelo;
	private String anio;
	private String color;
	private String estado;
	private String fecha;
	private String hora_partida;
	private int costo;
	private String Origen;
	private String Destino;
	private String nombre;
	private String apellido;
	private String DNI;
	private String telefono;
	
	public BoletoForm() {
		
	}

	public BoletoForm(String modelo, String anio, String color, String estado, String fecha, String hora_partida,
			int costo, String origen, String destino, String nombre, String apellido, String dNI, String telefono) {
		super();
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.estado = estado;
		this.fecha = fecha;
		this.hora_partida = hora_partida;
		this.costo = costo;
		Origen = origen;
		Destino = destino;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.telefono = telefono;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getHora_partida() {
		return hora_partida;
	}

	public void setHora_partida(String hora_partida) {
		this.hora_partida = hora_partida;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
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
	
	
}
