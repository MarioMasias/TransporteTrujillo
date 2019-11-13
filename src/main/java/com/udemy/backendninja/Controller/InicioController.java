package com.udemy.backendninja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Inicio")
public class InicioController {
	
	@GetMapping("/principal")
	public ModelAndView  VerCliente() {
		ModelAndView mav= new ModelAndView("PantallaInicial");
		return mav;
	}

}
