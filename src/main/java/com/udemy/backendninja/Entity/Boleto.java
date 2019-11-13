package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Boleto")
public class Boleto {
	
	@Id
	@GeneratedValue
	@Column(name="id_Boleto")
	int id_Boleto;
	@Column(name="id_Cliente")
	int id_Cliente;
	@Column(name="id_Viaje")
	int id_Viaje;
	@Column(name="id_Tarifa")
	int id_Tarifa;
	@Column(name="id_Bus")
	int id_Bus;
	@Column(name="Fecha")
	String Fecha;
	@Column(name="Hora_partida")
	String Hora_partida;
	

	public Boleto() {
		
	}


	public Boleto(int id_Boleto, int id_Cliente, int id_Viaje, int id_Tarifa, int id_Bus, String fecha,
			String hora_partida) {
		super();
		this.id_Boleto = id_Boleto;
		this.id_Cliente = id_Cliente;
		this.id_Viaje = id_Viaje;
		this.id_Tarifa = id_Tarifa;
		this.id_Bus = id_Bus;
		Fecha = fecha;
		Hora_partida = hora_partida;
	}


	public int getId_Boleto() {
		return id_Boleto;
	}


	public void setId_Boleto(int id_Boleto) {
		this.id_Boleto = id_Boleto;
	}


	public int getId_Cliente() {
		return id_Cliente;
	}


	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}


	public int getId_Viaje() {
		return id_Viaje;
	}


	public void setId_Viaje(int id_Viaje) {
		this.id_Viaje = id_Viaje;
	}


	public int getId_Tarifa() {
		return id_Tarifa;
	}


	public void setId_Tarifa(int id_Tarifa) {
		this.id_Tarifa = id_Tarifa;
	}


	public int getId_Bus() {
		return id_Bus;
	}


	public void setId_Bus(int id_Bus) {
		this.id_Bus = id_Bus;
	}


	public String getFecha() {
		return Fecha;
	}


	public void setFecha(String fecha) {
		Fecha = fecha;
	}


	public String getHora_partida() {
		return Hora_partida;
	}


	public void setHora_partida(String hora_partida) {
		Hora_partida = hora_partida;
	}
	
	
}
