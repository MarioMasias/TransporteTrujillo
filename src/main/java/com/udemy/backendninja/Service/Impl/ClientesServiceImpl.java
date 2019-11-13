package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Clientes;
import com.udemy.backendninja.Repository.ClienteJPARepository;
import com.udemy.backendninja.Service.ClientesService;

@Service("ClienteService")
public class ClientesServiceImpl implements ClientesService{
	
	@Autowired
	@Qualifier ("clienteJPARespository")
	private ClienteJPARepository clienteJPARepository;

	@Override
	public List<Clientes> listAllClientes() {
		return clienteJPARepository.findAll();
	}

	@Override
	public Clientes addClientes(Clientes cliente) {
		System.out.println("En servicio de Clientes");
		
		//System.out.println("Agregados Clientes");
		return clienteJPARepository.save(cliente);
	}

	@Override
	public int removerCliente(Clientes cliente) {
		clienteJPARepository.delete(cliente);
		return 0;
	}

	@Override
	public Clientes actualizarCliente(Clientes cliente) {
		clienteJPARepository.save(cliente);
		return null;
	}
	
	
	

}
