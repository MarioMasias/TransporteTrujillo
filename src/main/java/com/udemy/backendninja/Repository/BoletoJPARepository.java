package com.udemy.backendninja.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.Entity.Boleto;

@Repository("boletoJPARespository")
public interface BoletoJPARepository extends JpaRepository<Boleto, Serializable>{

}
