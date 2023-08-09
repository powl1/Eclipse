package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@GetMapping("/test") // <-- 리퀘스트 : 사용자가 주소 뒤에 치고 들어오는 사이트 이름[경로] 같은 개념
	public String test() { 
		return "/WEB-INF/views/test" + ".jsp"; // 돌아가는 원리는 자바 문법이 아니라 스프링 문법인건다. 
	}
	
	@GetMapping("/test2")
	public String test2() { 
		return "test2";  // <-- 이게 바로 해당 jsp의 이름[제목]
	}
	
	@GetMapping("/test3")
	public String test3() { 
		return "test3";
	}
	
}