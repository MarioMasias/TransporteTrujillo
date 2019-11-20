package com.udemy.backendninja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Verificacion")
public class VerificacionController {
	
	@GetMapping("/mostrar")
	public String mostrar() {
		return "Verificacion";
	}

}
