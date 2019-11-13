package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Service.BoletoService;
import com.udemy.backendninja.Service.BusService;
import com.udemy.backendninja.Service.ModelForm.BoletoForm;

@Controller
@RequestMapping("/Boleto")
public class BoletoController {
	
	@Autowired
	@Qualifier("BoletoService")
	private BoletoService boletoService;
	
	@Autowired
	@Qualifier("BusService")
	private BusService busService;
	
	

	
	@GetMapping("/verBoleto")
	public ModelAndView  VerBoleto() {
		ModelAndView mav= new ModelAndView("MostrarBoleto");
		mav.addObject("BoletoForm1", new BoletoForm());
		mav.addObject("Boletos", boletoService.listar());
		mav.addObject("Buses", busService.listar());
		return mav;
	}
	
	@PostMapping("/addBoleto")
	public String AgregarBoleto(@ModelAttribute("boleto") BoletoForm boleto) {
		System.out.println("AgregarBoleto");
		boletoService.Agregar1(boleto);
		return "redirect:/Boleto/verBoleto";
	}

}
