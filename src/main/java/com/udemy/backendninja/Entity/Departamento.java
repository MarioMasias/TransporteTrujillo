package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento {
	@Id
	@GeneratedValue
	@Column(name="id_Departamento")
	int id_Departamento;
	@Column(name="nombre")
	String nombre;
	
	public Departamento() {
		
	}
	
	public Departamento(int id_Departamento, String nombre) {
		super();
		this.id_Departamento = id_Departamento;
		this.nombre = nombre;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [id_Departamento=" + id_Departamento + ", nombre=" + nombre + "]";
	}
}
