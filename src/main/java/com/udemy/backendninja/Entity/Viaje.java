package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Viaje")
public class Viaje {
	@Id
	@GeneratedValue
	@Column(name="id_viaje")
	int id_viaje;
	@Column(name="Origen")
	String Origen;
	@Column(name="Destino")
	String Destino;
	
	public Viaje() {}
	
	public Viaje(int id_viaje, String origen, String destino) {
		super();
		this.id_viaje = id_viaje;
		Origen = origen;
		Destino = destino;
	}

	public int getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
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

}
