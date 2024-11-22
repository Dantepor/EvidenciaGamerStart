package com.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/proyecto")
public class LoginController {

	@GetMapping({"/login", "/entrar"})
	public String login(Model model) {
		return "login";
	}
}
