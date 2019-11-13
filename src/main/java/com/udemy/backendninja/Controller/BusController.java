package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.Bus;
import com.udemy.backendninja.Service.BusService;

@Controller
@RequestMapping("/Bus")
public class BusController {
	@Autowired
	@Qualifier("BusService")
	private BusService busService;
	
	@GetMapping("/verBus")
	public ModelAndView  VerBuses() {
		ModelAndView mav= new ModelAndView("MostrarBuses");
		mav.addObject("Bus1", new Bus());
		mav.addObject("Buses", busService.listar());
		return mav;
	}
	
	@PostMapping("/addBus")
	public String AgregarBus(@ModelAttribute("bus") Bus bus) {
		busService.Agregar(bus);
		return "redirect:/Bus/verBus";
	}

}
