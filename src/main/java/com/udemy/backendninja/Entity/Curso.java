package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="descripcion")
	private String description;
	
	@Column(name="precio")
	private int precio;
	
	@Column(name="horas")
	private int hours;
	
	public Curso() {
		
	}
	
	public Curso(int id, String name, String description, int precio, int hours) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.precio = precio;
		this.hours = hours;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
}
