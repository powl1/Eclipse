package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.pencil.Pencil;

public class MainPencil {

   public static void main(String[] args) {
      
      String config = "classpath:appCTX2.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
      // AbstractApplicationContext ctx = new [GenericXmlApplicationContext](config);
      // o.a.c.c.C.[Tomcat].[localhost].[/] : Initializing Spring embedded [WebApplicationContext]
      // 위 대괄호 친 내용이 없으면 스프링이 아니다
      Pencil pencil = (Pencil)ctx.getBean("pencil");
      pencil.use();
      
      ctx.close();

   }
   
}