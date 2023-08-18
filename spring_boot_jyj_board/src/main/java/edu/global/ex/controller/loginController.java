package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

// @RestController
@Slf4j
@Controller
public class loginController {
	
	@GetMapping("/login")
	public String login() {
		return "login/login";
	}
}
