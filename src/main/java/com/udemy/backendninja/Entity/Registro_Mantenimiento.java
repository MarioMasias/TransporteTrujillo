package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registro_Mantenimiento")
public class Registro_Mantenimiento {
	@Id
	@GeneratedValue
	@Column(name="id_reg_mantenimiento")
	int id_reg_mantenimiento;
	@Column(name="id_solicitud")
	int id_solicitud;
	@Column(name="estado")
	String estado;
	@Column(name="fecha")
	String fecha;
	@Column(name="detalles")
	String detalles;
	
	public Registro_Mantenimiento() {
		
	}
	
	public Registro_Mantenimiento(int id_reg_mantenimiento, int id_solicitud, String estado, String fecha,
			String detalles) {
		super();
		this.id_reg_mantenimiento = id_reg_mantenimiento;
		this.id_solicitud = id_solicitud;
		this.estado = estado;
		this.fecha = fecha;
		this.detalles = detalles;
	}

	public int getId_reg_mantenimiento() {
		return id_reg_mantenimiento;
	}

	public void setId_reg_mantenimiento(int id_reg_mantenimiento) {
		this.id_reg_mantenimiento = id_reg_mantenimiento;
	}

	public int getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Registro_Mantenimiento [id_reg_mantenimiento=" + id_reg_mantenimiento + ", id_solicitud=" + id_solicitud
				+ ", estado=" + estado + ", fecha=" + fecha + ", detalles=" + detalles + "]";
	}
	
}
