package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.Entity.Registro_Mantenimiento;

@Repository("RegistroMantenimientoJPARepository")
public interface RegistroMantenimientoJPARepository extends JpaRepository<Registro_Mantenimiento, Serializable>{

}
