package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.global.ex.vo.GradeVO;
import edu.global.ex.vo.MemberVO;


@Controller
@RequestMapping("/board/*") // /board 로 검색하고 들어오는 모든 것들은 여기서 컨트롤 하라는 의미
public class BoardController {

	@GetMapping("/insert")
	public String insert() {
		return "board/insert";
	}

	@GetMapping("/delete") // GetMapping 은 XmlApplication 을 위한 문법이다
	public String delete() {
		return "board/delete";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST) // <-- RequestMapping 은 이렇게 메소드를 지정해줄 수 있다. [기본값 :
																	// 메소드_GET]
	// 405 에러 : 메소드 오류 GET방식
	// @RequestMapping("/update")
	public String update() {
		return "board/update";
	}

	@GetMapping("/content")
	public String content(Model model) { // <-- (Model model) : 호출해 주는 주최가 XmlApplication [스프링]이다.
		model.addAttribute("id", "1234"); // 변수명 "id"로 주고, 변수 스트링으로 "1234"
		model.addAttribute("pw", "abcd");

		model.addAttribute("name", "홍길동");
		model.addAttribute("age", 1234); // 데이터 타입이 객체도 가능

		return "board/content";
	}

	@GetMapping("/reply")
	public ModelAndView reply() { // <-- (Model model) : 호출해 주는 주최가 XmlApplication [스프링]이다.
		// public ModelAndView reply(ModelAndView mv) { == ModelAndView mv = new
		// ModelAndView(); : 스프링에게 알아서 가져와라 라는 걸로 new를 새로 생성 안 해도 된다.
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("board/reply");

		return mv;
	}

	// ------------------- form 시작 ---------------------- //

	// 유저에게 보내는 정보 받아내기
	// 1. HttpServletRequest를 통하여 받아오기
//	@GetMapping("/confirm")
//	public String confirm(HttpServletRequest request, Model model) {
//      
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		  
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		  
//		return "board/confirm";
//	}

	@RequestMapping(value = "/confirmPost2", method = RequestMethod.POST)
	public String confirmPost2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/confirm";
	}

//  @PostMapping("/confirm")
//  public String confirmPost(HttpServletRequest request, Model model) {
//     
//     String id = request.getParameter("id");
//     String pw = request.getParameter("pw");
//     
//     model.addAttribute("id", id);
//     model.addAttribute("pw", pw);
//     
//     return "board/confirm";
//  }

	
	// 2.@RequestParam를 통하여 받아오기
//	@GetMapping("/confirm")
//	public String confirm(@RequestParam("id") String id,
//						  @RequestParam("pw") String pw, Model model) {
//
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//
//		return "board/confirm";
//	}

	
	// 3. commend 객체를 이용하는 방법
	// 내부동작
	// MemberVO memberVO = new MemberVo();
	// memberVO.getID(request.getParameter("id"));
	// model.addAttribute("memberVO", memberVO);
	@GetMapping("/confirm")
	public String confirm(MemberVO memberVO) {

		System.out.println(memberVO);
		// Console 창에
		// MemberVO(id=1234, pw=1234) 이렇게 입력값이 보여지게된다.  
		
		// model.addAttribute("id", memberVO.getId());
		// model.addAttribute("pw", memberVO.getPw());

		return "board/confirm";
	}
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	// ------------------- form 끝 ---------------------- //
	
//	@GetMapping("/grade")
//	public String grade(Model model) {
//		int kor = Integer.valueOf("kor");
//		int eng = Integer.valueOf("eng");
//		int mat = Integer.valueOf("mat");
//		
//		model.addAttribute("kor", kor);
//		model.addAttribute("eng", eng);
//		model.addAttribute("mat", mat);
//
//		return "board/grade";
//	}
	
	
	// 3. command 객체를 이용하는 방법
	// 내부동작
	// GradeVO gradeVO = new GradeVO();
	// gradeVO.setEng(request.getParameter("eng");
	// model.addAttribute("gardeVO", grdaeVO);
	@GetMapping("/grade")
	public String grade(GradeVO gradeVO) {
		return "board/grade";
	}
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
}

// 
// 스프링 = @애너테이션 프로그램 = @애너테이션 은 기능(함수임)
// Model 객체 = 
// Bean = Pojo = command 객체 = VO객체 = Dto 객체