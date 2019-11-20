package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Averia;

public interface AveriaService {
	public abstract List<Averia> listAllAveria();
	public abstract Averia addAveria(Averia averia);

}
