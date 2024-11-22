package com.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/proyecto")
public class RegistroController {

	@GetMapping({"/registro", "/nuevo"})
	public String registro(Model model) {
		return "registro";
	}
}
