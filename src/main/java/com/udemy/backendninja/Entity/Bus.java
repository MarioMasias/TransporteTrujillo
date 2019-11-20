package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bus")
public class Bus {
	@Id
	@GeneratedValue
	@Column(name="id_Bus")
	int id;
	@Column(name="placa")
	String placa;
	@Column(name="modelo")
	String modelo;
	@Column(name="anio")
	String anio;
	@Column(name="color")
	String  color;
	@Column(name="num_asientos")
	int  numero_asientos;

	public Bus(){
		
	}

	public Bus(int id,String placa,  String modelo, String anio, String color, int numero_asientos) {
		super();
		this.id = id;
		this.placa=placa;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.numero_asientos=numero_asientos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public int getNumero_asientos() {
		return numero_asientos;
	}

	public void setNumero_asientos(int numero_asientos) {
		this.numero_asientos = numero_asientos;
	}

	
	

}
