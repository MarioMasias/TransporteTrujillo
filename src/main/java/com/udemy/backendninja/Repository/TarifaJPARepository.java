package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.backendninja.Entity.Tarifa;

public interface TarifaJPARepository extends JpaRepository< Tarifa, Serializable>{

}
