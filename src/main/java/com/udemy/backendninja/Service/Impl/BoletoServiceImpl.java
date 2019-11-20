package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Boleto;
import com.udemy.backendninja.Entity.Bus;
import com.udemy.backendninja.Entity.Clientes;
import com.udemy.backendninja.Repository.BoletoJPARepository;
import com.udemy.backendninja.Service.BoletoService;
import com.udemy.backendninja.Service.ClientesService;
import com.udemy.backendninja.Service.TarifaService;
import com.udemy.backendninja.Service.ModelForm.BoletoForm;
@Service("BoletoService")
public class BoletoServiceImpl implements BoletoService{
	@Autowired
	@Qualifier("boletoJPARespository")
	private BoletoJPARepository boletoJPARepository;
	
	@Autowired
	@Qualifier("ClienteService")
	private ClientesService clienteService;
	
	@Autowired
	@Qualifier("TarifaService")
	private TarifaService tarifaService;

	@Override
	public List<Boleto> listar() {
		return boletoJPARepository.findAll();
	}

	@Override
	public Boleto Agregar(Boleto boleto) {
		return boletoJPARepository.save(boleto);
	}
	
	public int Agregar1(BoletoForm boleto) {
		/*Cliente*/
		System.out.println("AgregarCliente");
		Clientes c1= new Clientes();
		Clientes c2= new Clientes();
		c1.setNombre(boleto.getNombre());
		c1.setApellido(boleto.getApellido());
		c1.setDNI(boleto.getDNI());
		c1.setTelefono(boleto.getTelefono());
		System.out.println(c1.toString());
		c2=clienteService.addClientes(c1);
		System.out.println("RETORNADO: -->"+c2.getId_Cliente());
		Boleto boleto1= new Boleto();
		boleto1.setId_Bus(boleto.getId_Bus());
		boleto1.setId_Cliente(c2.getId_Cliente());
		boleto1.setId_Viaje(boleto.getId_Viaje());
		//boleto1.setId_Tarifa();
		tarifaService.BuscarID(boleto.getId_Viaje());
		return 0;
	}

}
