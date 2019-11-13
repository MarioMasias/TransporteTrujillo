package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tarifa")
public class Tarifa {
	@Id
	@GeneratedValue
	@Column(name="id_Bus")
	int id_tarifa;
	@Column(name="id_viaje")
	int id_viaje;
	@Column(name="costo")
	int costo;
	
	public Tarifa() {
		
	}

	public Tarifa(int id_tarifa, int id_viaje, int costo) {
		super();
		this.id_tarifa = id_tarifa;
		this.id_viaje = id_viaje;
		this.costo = costo;
	}

	public int getId_tarifa() {
		return id_tarifa;
	}

	public void setId_tarifa(int id_tarifa) {
		this.id_tarifa = id_tarifa;
	}

	public int getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
