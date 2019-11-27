package com.udemy.backendninja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.Entity.User;

@Controller
public class LoginController {
	
	
	@GetMapping({"/","login"})
	public ModelAndView index() {
		ModelAndView mav= new ModelAndView("login");
		mav.addObject("usuario", new User());
		return mav;
	}
	
	@PostMapping("/validar")
	public String AgregarCliente(@ModelAttribute("user") User user) {
		String pagina="redirect:/login";
		System.out.println(user.getUsername());
		if(user.getUsername().equals("admin")) {
			System.out.println("con if "+pagina);
			pagina="redirect:/Inicio/principal";
		}
		System.out.println("sin if "+pagina);
		System.out.println(user.getUsername()+" "+user.getPass());
		return pagina;
	}

}
