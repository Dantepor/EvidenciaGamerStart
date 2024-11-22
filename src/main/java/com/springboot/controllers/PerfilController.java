package com.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/ingreso")
public class PerfilController {

	@GetMapping({"/perfil", "/persona"})
	public String perfil(Model model) {
		return "perfil";
	}
}
