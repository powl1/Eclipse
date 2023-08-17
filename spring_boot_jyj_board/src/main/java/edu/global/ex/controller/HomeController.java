package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

// @RestController
@Slf4j
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/user/userHome")
	public void userHome() { // void : 적게 되면 url을 읽어버리게 된다.
		log.info("userHome().. ");
		// return "home";
	}
	
	@GetMapping("/admin/adminHome")
	public void adminHome() {
		log.info("adminHome().. ");
	}
	
//	@GetMapping("/user/userHome")
//	public String userHome() {
//		Log.info("userHome().. ");
//		// return "home";
//	}
}
