package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textListar;
	
	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textIndex);
		return "index";
		
	}
	
	@RequestMapping("/perfil")
	private String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Angel");
		usuario.setApellido("Poveda");
		usuario.setEmail("aaa@ddd.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	private String listar(Model model) {
		model.addAttribute("titulo", textListar);
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
