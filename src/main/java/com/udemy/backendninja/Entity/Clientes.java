package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Clientes {
	@Id
	@GeneratedValue
	@Column(name="id_Cliente")
	int id_Cliente;
	@Column(name="Nombre")
	String Nombre;
	@Column(name="Apellido")
	String Apellido;
	@Column(name="DNI")
	String DNI;
	@Column(name="Telefono")
	String Telefono;
	
	public Clientes() {
		
	}

	

	public Clientes(int id_Cliente, String nombre, String apellido, String dNI, String telefono) {
		super();
		this.id_Cliente = id_Cliente;
		Nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
		Telefono = telefono;
	}



	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getTelefono() {
		return Telefono;
	}



	public void setTelefono(String telefono) {
		Telefono = telefono;
	}



	@Override
	public String toString() {
		return "Clientes [id_Cliente=" + id_Cliente + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI
				+ ", Telefono=" + Telefono + "]";
	}
	
	

}
