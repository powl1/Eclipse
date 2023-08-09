package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.vo.UserVO;

@Controller
@RequestMapping("/user/*")
public class UsersController {
	
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}

   @PostMapping("/confirm")
   public String confirm(UserVO userVO) {
      String id = userVO.getId();
      
      if(id.equals("abc")) {
    	  return "redirect:loginOK";
      }
      return "redirect:loginFail";
   }
   
   @GetMapping("/loginOK")
	public String loginOK() {
		return "/user/loginOK";
	}
   
   @GetMapping("/loginFail")
	public String loginFail() {
		return "/user/loginFail";
	}
}