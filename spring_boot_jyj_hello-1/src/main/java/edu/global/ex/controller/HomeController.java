package edu.global.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @GetMapping("/")
   public String home() {
      return "안녕하세요";
   }
   
   @GetMapping("/hello")
   public String hello() {
      return "hello~~~~~~~";
   }
   
   @GetMapping("/home")
   public String home1() {
      return "home 입니다.";
   }
}