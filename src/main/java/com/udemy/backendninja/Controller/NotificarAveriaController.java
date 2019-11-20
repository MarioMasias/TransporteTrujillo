package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Service.AveriaService;
import com.udemy.backendninja.Service.BusService;
import com.udemy.backendninja.Service.RegistroAveriaService;
import com.udemy.backendninja.Service.ModelForm.NotificarForm;

@Controller
@RequestMapping("/notificarnicio")
public class NotificarAveriaController {
	
	@Autowired
	@Qualifier("BusService")
	private BusService busService;
	
	@Autowired
	@Qualifier("RegistroAveriaService")
	private RegistroAveriaService registroService;
	
	@Autowired
	@Qualifier("AveriaService")
	private AveriaService averiaService;
	
	@GetMapping("/mostrar")
	public ModelAndView mostrar() {
		ModelAndView mav= new ModelAndView("Notificar");
		mav.addObject("notif", new NotificarForm());
		mav.addObject("Buses", busService.listar());
		mav.addObject("Averias", averiaService.listAllAveria());
		return mav;
	}
	
	@PostMapping("/addNotifica")
	public String AgregarNotificar(@ModelAttribute("notifica") NotificarForm notifica) {
		System.out.println("AgregarNotificacion");
		//boletoService.Agregar1(boleto);
		registroService.addRegistroTodo(notifica);
		return "redirect:/notificarnicio/mostrar";
	}

}
