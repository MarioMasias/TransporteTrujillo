package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Service.ViajeService;
import com.udemy.backendninja.Service.ModelForm.ViajeForm;

@Controller
@RequestMapping("/Viaje")
public class ViajeController {
	@Autowired
	@Qualifier("ViajeService")
	private ViajeService viajeService;
	
	@GetMapping("/verViaje")
	public ModelAndView  VerCliente() {
		ModelAndView mav= new ModelAndView("MostrarViajes");
		mav.addObject("ViajeForm1", new ViajeForm());
		mav.addObject("Viajes", viajeService.listAllViaje());
		return mav;
	}
	
	@PostMapping("/addViaje")
	public String AgregarCliente(@ModelAttribute("viaje") ViajeForm viaje) {
		viajeService.agregarViaje(viaje);
		return "redirect:/Viaje/verViaje";
	}

}
