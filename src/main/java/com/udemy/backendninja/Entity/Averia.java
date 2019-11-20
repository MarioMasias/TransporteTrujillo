package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Averia")
public class Averia {
	@Id
	@GeneratedValue
	@Column(name="id_averia")
	int id_averia;
	@Column(name="nombre_averia")
	String nombre_averia;
	@Column(name="grado_averia")
	int grado_averia;
	
	public Averia() {
		
	}

	public Averia(int id_averia, String nombre_averia, int grado_averia) {
		super();
		this.id_averia = id_averia;
		this.nombre_averia = nombre_averia;
		this.grado_averia = grado_averia;
	}

	public int getId_averia() {
		return id_averia;
	}

	public void setId_averia(int id_averia) {
		this.id_averia = id_averia;
	}

	public String getNombre_averia() {
		return nombre_averia;
	}

	public void setNombre_averia(String nombre_averia) {
		this.nombre_averia = nombre_averia;
	}

	public int getGrado_averia() {
		return grado_averia;
	}

	public void setGrado_averia(int grado_averia) {
		this.grado_averia = grado_averia;
	}
	
	

}
