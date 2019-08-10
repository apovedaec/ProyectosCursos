package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/string")
	public String param(@RequestParam(name = "texto", required = false, defaultValue = "hola") String texto ,Model model) {
		
		model.addAttribute("resultado","El texto enviado es: "+ texto);
		
		return "params/ver";
	}
	
	
	@GetMapping("/")
	public String index() {
		
		return "params/index";
	}

}
