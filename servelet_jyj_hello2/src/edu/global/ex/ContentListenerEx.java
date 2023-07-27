package edu.global.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContentListenerEx implements ServletContextListener {
	@Override
   public void contextDestroyed(ServletContextEvent arg0) {
      // TODO Auto-generated method stub
      System.out.println("컨텍스트 죽음");
   }

   @Override
   public void contextInitialized(ServletContextEvent arg0) {
      // TODO Auto-generated method stub
      System.out.println("컨텍스트 초기화 됨");
   }
}
