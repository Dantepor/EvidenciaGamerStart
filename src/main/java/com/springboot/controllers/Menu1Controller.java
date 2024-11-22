package com.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/menu")
public class Menu1Controller {

	@GetMapping({"/segundo", "/second"})
	public String menu1(Model model) {
		return "menu1";
	}
}
