package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.vo.CircleVO;

@Controller
@RequestMapping("/shape/*")
public class ShapeController {

   @GetMapping("/input")
   public String input() {
      return "input_circle";
   }
   
   @GetMapping("/circleArea")
   public String circleArea(CircleVO circleVO) {
	   return "circleArea";
   }
}