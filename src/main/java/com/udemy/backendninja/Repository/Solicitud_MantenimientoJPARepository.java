package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.Entity.Solicitud_Mantenimiento;

@Repository("Solicitud_MantenimientoJPARespository")
public interface Solicitud_MantenimientoJPARepository extends JpaRepository<Solicitud_Mantenimiento, Serializable>{

}
