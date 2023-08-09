package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.service.EmpService;
import edu.global.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/emp/*")
public class EmpController {
	
	@Autowired
	public EmpService empService;

	@GetMapping("/list")
	public String list(Model model) {
		
		log.info("list().."); // system.out.print 와 동일하지만. 콘솔 출력 앞에 날짜, 시간이 같이 출력된다.
		
		model.addAttribute("emps", empService.getList());
		
		return "/emp/list";
	}
	
}
