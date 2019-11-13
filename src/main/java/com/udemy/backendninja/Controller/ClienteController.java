package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.Clientes;
import com.udemy.backendninja.Service.ClientesService;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	@Qualifier("ClienteService")
	private ClientesService clienteService;
	
	@GetMapping("/verCliente")
	public ModelAndView  VerCliente() {
		ModelAndView mav= new ModelAndView("MostrarClientes");
		mav.addObject("Cliente1", new Clientes());
		mav.addObject("Clientes", clienteService.listAllClientes());
		return mav;
	}
	
	@PostMapping("/addCliente")
	public String AgregarCliente(@ModelAttribute("cliente") Clientes cliente) {
		System.out.println(cliente.getId_Cliente());
		clienteService.addClientes(cliente);
		return "redirect:/Cliente/verCliente";
	}

}
