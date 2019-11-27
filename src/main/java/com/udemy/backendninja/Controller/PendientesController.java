package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.Solicitud_Mantenimiento;
import com.udemy.backendninja.Repository.RegistroAveriaJPARepository;
import com.udemy.backendninja.Service.BusService;
import com.udemy.backendninja.Service.RegistroAveriaService;
import com.udemy.backendninja.Service.SolicitudMantenimientoService;
import com.udemy.backendninja.Service.ViajeService;
import com.udemy.backendninja.Service.ModelForm.NotificarForm;

@Controller
@RequestMapping("/Pendientes")
public class PendientesController {
	@Autowired
	@Qualifier ("RegistroAveriaService")
	private RegistroAveriaService ras;
	
	@Autowired
	@Qualifier ("SolicitudMantenimientoService")
	private SolicitudMantenimientoService solman1;
	
	
	/*@GetMapping("/mostrar")
	public String mostrar() {
		return "Pendientes";
	}*/
	
	@GetMapping("/mostrar")
	public ModelAndView mostrar2() {
		ModelAndView mav= new ModelAndView("Pendientes");
		mav.addObject("Pendientes", ras.MostrarPendiente());
		mav.addObject("Mantenimiento", new Solicitud_Mantenimiento());
		return mav;
	}
	
	@PostMapping("/addMantenimiento")
	public String AgregarNotificar(@ModelAttribute("mantenimiento") Solicitud_Mantenimiento solman) {
		System.out.println("AgregarNotificacion");
		//boletoService.Agregar1(boleto);
		solman.setCosto_mantenimiento(1000);
		solman.setEstado_mantenimiento("MUY GRAVE");
		solman.setFecha_aprobacion("27/11/2019");
		solman.setId_regAveria(1);
		solman1.guardar(solman);
		return "redirect:/Pendientes/mostrar";
	}

}
