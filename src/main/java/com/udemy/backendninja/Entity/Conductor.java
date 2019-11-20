package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Conductor")
public class Conductor {
	@Id
	@GeneratedValue
	@Column(name="id_Conductor")
	int id_conductor;
	@Column(name="nombre_Conductor")
	String nombre;
	@Column(name="apellido_Conductor")
	String apellido;
	
	public Conductor() {
		
	}

	public Conductor(int id_conductor, String nombre, String apellido) {
		super();
		this.id_conductor = id_conductor;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId_conductor() {
		return id_conductor;
	}

	public void setId_conductor(int id_conductor) {
		this.id_conductor = id_conductor;
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
	
	

}
