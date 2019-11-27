package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.Registro_Mantenimiento;
import com.udemy.backendninja.Entity.Solicitud_Mantenimiento;
import com.udemy.backendninja.Service.RegistroAveriaService;
import com.udemy.backendninja.Service.RegistroMantenimientoService;
import com.udemy.backendninja.Service.SolicitudMantenimientoService;

@Controller
@RequestMapping("/Mantenimiento")
public class MantenimientoController {
	
	@Autowired
	@Qualifier ("RegistroAveriaService")
	private RegistroAveriaService ras;
	
	@Autowired
	@Qualifier ("RegistroMantenimientoService")
	private RegistroMantenimientoService regman1;
	
	
	/*@GetMapping("/mostrar")
	public String mostrar() {
		return "Pendientes";
	}*/
	
	@GetMapping("/mostrar")
	public ModelAndView mostrar2() {
		ModelAndView mav= new ModelAndView("Mantenimiento");
		mav.addObject("Pendientes", ras.MostrarPendiente());
		mav.addObject("Mantenimiento", new Registro_Mantenimiento());
		return mav;
	}
	
	@PostMapping("/addMantenimiento")
	public String AgregarNotificar(@ModelAttribute("mantenimiento") Registro_Mantenimiento solman) {
		System.out.println("AgregarNotificacion");
		//boletoService.Agregar1(boleto);
		solman.setFecha("27/11/2019");
		solman.setId_reg_mantenimiento(1);
		regman1.agregar(solman);
		return "redirect:/Mantenimiento/mostrar";
	}

}
