package com.udemy.backendninja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	//Primera Forma
	@GetMapping("exampleString")
	public String exampleString(Model model) {
		model.addAttribute("name", "Jon");
		return "example";
	}
	
	@GetMapping("ejemplo")
	public String ejemploString() {
		return "example";
	}
	
	//Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav= new ModelAndView("example");
		mav.addObject("name","Mike");
		return mav;
	}
		
	}
	
