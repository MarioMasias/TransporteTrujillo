package com.udemy.backendninja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.Persona;
import com.udemy.backendninja.Service.PersonaService;

@Controller
@RequestMapping("/inicio")
public class PersonaController {
	
	@Autowired 
	@Qualifier("PersonaService")
	private PersonaService servicioPersona;
	
	@GetMapping("/form")
	public String pagina1() {
		return "formulario";
	}
	
	@GetMapping("/mostrar")
	public String pagina2() {
		return "Mostrar";
	}
	
	@GetMapping("/mostrarDato")
	public ModelAndView paginaForm() {
		ModelAndView mav= new ModelAndView("Mostrar");
		//mav.addObject("nombre", "Arturo");
		//Persona p=new Persona(1, "Mario",24, "3386781");
		//servicioPersona.Agregar(p);
		mav.addObject("persona1", new Persona());
		mav.addObject("personas", servicioPersona.listar());
		System.out.println(servicioPersona.listar());
		return mav;
	}
	
	@PostMapping("/addPersona")
	public String Agregar(@ModelAttribute("persona") Persona persona) {
		System.out.println("datos: "+persona.toString());
		servicioPersona.Agregar(persona);
		return "redirect:/inicio/mostrarDato";
	}

}
