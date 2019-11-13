package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Clientes;

public interface ClientesService {
	public abstract List<Clientes> listAllClientes();
	public abstract Clientes addClientes(Clientes cliente);
	public abstract int removerCliente(Clientes cliente);
	public abstract Clientes actualizarCliente(Clientes cliente);

}
