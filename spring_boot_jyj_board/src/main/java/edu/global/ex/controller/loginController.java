package edu.global.ex.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
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
	
	/*로그인 정보를 가져오는 방법 */
	@GetMapping("/loginInfo")
	public String loginInfo(Authentication authentication,Principal principal) {
		
		String user_id;
		
		//1.SpringContextHolder를 통하여 가져오는 방법(일반적인 빈에서 사용 할수있음 )		
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //user_id = auth.getName();
        //System.out.println("유저 아이디:" + user_id   );
                		
		//2.authentication 객체로 가져오는 방법(많은 )        		
		System.out.println("authentication 유저 아이디:" + authentication.getName()   );
		System.out.println("authentication 권한들:" + authentication.getAuthorities()   );
		
		//3.Principal 객체로 가져오는 방법(가져올수 있는게 getName() 정도       		
		System.out.println("Principal 유저 아이디:" + principal.getName() );
        
        return "redirect:/";

	}
	
//	@GetMapping("/session")
//	public String session(HttpSession httpSession) {
//		AuthVO auth = new AuthVO();
//		auth.setUsername("testAuth");
//		
//		httpSession.setAttribute("auth", auth);
//		
//		return "/home";
//	}
	
}
