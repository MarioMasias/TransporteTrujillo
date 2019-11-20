package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RegistroAveria")
public class RegistroAveria {
	@Id
	@GeneratedValue
	@Column(name="id_registroaveria")
	int id_registroaveria;
	@Column(name="id_bus")
	int id_bus;
	@Column(name="id_averia")
	int id_averia;
	@Column(name="id_conductor")
	int id_conductor;
	@Column(name="detalle_averia")
	String detalle_averia;
	@Column(name="fecha_registro")
	String fecha_registro;
	
	public RegistroAveria() {
		
	}

	public RegistroAveria(int id_registroaveria, int id_bus, int id_averia, int id_conductor, String detalle_averia,
			String fecha_registro) {
		super();
		this.id_registroaveria = id_registroaveria;
		this.id_bus = id_bus;
		this.id_averia = id_averia;
		this.id_conductor = id_conductor;
		this.detalle_averia = detalle_averia;
		this.fecha_registro = fecha_registro;
	}

	public int getId_registroaveria() {
		return id_registroaveria;
	}

	public void setId_registroaveria(int id_registroaveria) {
		this.id_registroaveria = id_registroaveria;
	}

	public int getId_bus() {
		return id_bus;
	}

	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}

	public int getId_averia() {
		return id_averia;
	}

	public void setId_averia(int id_averia) {
		this.id_averia = id_averia;
	}

	public int getId_conductor() {
		return id_conductor;
	}

	public void setId_conductor(int id_conductor) {
		this.id_conductor = id_conductor;
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
	
	
	
	
}
