package com.udemy.backendninja.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Solicitud_Mantenimiento")
public class Solicitud_Mantenimiento {
	@Id
	@GeneratedValue
	@Column(name="id_solicitud")
	int id_solicitud;
	@Column(name="id_regAveria")
	int id_regAveria;
	@Column(name="estado_mantenimiento")
	String estado_mantenimiento;
	@Column(name="fecha_aprobacion")
	String fecha_aprobacion;
	@Column(name="costo_mantenimieto")
	int costo_mantenimiento;
	
	public Solicitud_Mantenimiento() {
		
	}

	public Solicitud_Mantenimiento(int id_solicitud, int id_regAveria, String estado_mantenimiento,
			String fecha_aprobacion, int costo_mantenimiento) {
		super();
		this.id_solicitud = id_solicitud;
		this.id_regAveria = id_regAveria;
		this.estado_mantenimiento = estado_mantenimiento;
		this.fecha_aprobacion = fecha_aprobacion;
		this.costo_mantenimiento = costo_mantenimiento;
	}

	public int getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public int getId_regAveria() {
		return id_regAveria;
	}

	public void setId_regAveria(int id_regAveria) {
		this.id_regAveria = id_regAveria;
	}

	public String getEstado_mantenimiento() {
		return estado_mantenimiento;
	}

	public void setEstado_mantenimiento(String estado_mantenimiento) {
		this.estado_mantenimiento = estado_mantenimiento;
	}

	public String getFecha_aprobacion() {
		return fecha_aprobacion;
	}

	public void setFecha_aprobacion(String fecha_aprobacion) {
		this.fecha_aprobacion = fecha_aprobacion;
	}

	public int getCosto_mantenimiento() {
		return costo_mantenimiento;
	}

	public void setCosto_mantenimiento(int costo_mantenimiento) {
		this.costo_mantenimiento = costo_mantenimiento;
	}

	@Override
	public String toString() {
		return "Solicitud_Mantenimiento [id_solicitud=" + id_solicitud + ", id_regAveria=" + id_regAveria
				+ ", estado_mantenimiento=" + estado_mantenimiento + ", fecha_aprobacion=" + fecha_aprobacion
				+ ", costo_mantenimiento=" + costo_mantenimiento + "]";
	}
	
	
}
