package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.Entity.Departamento;

@Repository("departamentoJPARepository")
public interface DepartamentoJPARepository extends JpaRepository<Departamento, Serializable>{

}
