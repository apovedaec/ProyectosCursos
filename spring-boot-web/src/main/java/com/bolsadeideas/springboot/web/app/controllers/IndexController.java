package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Frameworks");
		return "index";
		
	}
	
	@RequestMapping("/perfil")
	private String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Angel");
		usuario.setApellido("Poveda");
		usuario.setEmail("aaa@ddd.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	private String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	private List<Usuario> poblarUsuario(Model model) {
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Angel", "Poveda", "aa@eee.com"),
				new Usuario("Kary", "Galarraga", "kk@eee.com"),
				new Usuario("Vale", "Poveda", "vv@eee.com"),
				new Usuario("Kyara", "Poveda", "kk@eee.com")
				);
		return usuarios;
	}

}
