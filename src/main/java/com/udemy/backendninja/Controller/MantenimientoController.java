package com.udemy.backendninja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Mantenimiento")
public class MantenimientoController {
	
	@GetMapping("/mostrar")
	public String mostrar() {
		return "Mantenimiento";
	}

}
