package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Service.Servicio;

@Controller
@RequestMapping("/entrada")
public class Controlador1 {
	
	@Autowired Servicio servicio;
	
	@GetMapping("/pag1")
	public String pag1() {
		return "pag1";
	}
	
	@GetMapping("/pag12")
	public String tabla(Model model) {
		model.addAttribute("nombre", "Mario");
		model.addAttribute("apellido", "Masias");
		model.addAttribute("edad", "24");
		model.addAttribute("telefono", "959262490");
		servicio.Hello();
		return "pag1";
	}
	
	@GetMapping("/pag13")
	public ModelAndView tabla2() {
		ModelAndView mav= new ModelAndView("pag1");
		mav.addObject("nombre", "Mario");
		mav.addObject("apellido", "Masias");
		mav.addObject("edad", "24");
		mav.addObject("telefono", "959262490");
		servicio.Hello();
		return mav;
	}
}
