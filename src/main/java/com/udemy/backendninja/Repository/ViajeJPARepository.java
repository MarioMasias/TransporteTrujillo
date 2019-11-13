package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.backendninja.Entity.Viaje;

public interface ViajeJPARepository extends JpaRepository<Viaje, Serializable>{

}
