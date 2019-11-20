package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Conductor;

public interface ConductorService {
	public abstract List<Conductor> listarConductor();
	public abstract Conductor addConductor(Conductor conductor);
}
