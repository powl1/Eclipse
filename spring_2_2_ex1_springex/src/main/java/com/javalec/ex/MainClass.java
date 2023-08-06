package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Heart{
}

class Computer{
   Cpu cpu = new Cpu();
   
   Computer(Cpu cpu){ //주입
      
   }
}
class Cpu{
   Chip chip = new Chip();
    Cpu(Chip chip){
       
    }
}
class Chip{
   
}


//사람이 심장없으면 죽음, 사람이 심장에 의존한다는 의미
class Person{
//   Heart heart = new Heart(); //첫번째 방법: 다이렉트로 객체생성 
   
   Heart heart; //두번째방법:함수를 통해서
   Person(Heart heart){
      this.heart = heart;
   }
   void setHeart(Heart heart) {
      this.heart=heart;
   }
}
public class MainClass {

   public static void main(String[] args) {
      
      Person person = new Person(new Heart()); //다른 객체에서 넣어준다/여기선 main이넣어줌 = 주입이라고 표현함=DI
      
      // 객체호출순어 
      // Computer()>Cpu()>Chip()
      // Computer computer = new Computer();
      
      // Chip()>Cpu()>Computer()
      // Computer computer(new Computer(new Cpu(new Chip()))); //주입:칩이 완성돼야지 CPU에 값을 넣고,컴퓨터가안성됨=제어의 역전
      
      Calculation calculation = new Calculation();
      calculation.setFirstNum(10);
      calculation.setSecondNum(2);
      
      calculation.addition();
      calculation.subtraction();
      calculation.multiplication();
      calculation.division();
      
      System.out.println("====================");
      Circle circle = new Circle(10);
      System.out.println("넓이:"+circle.getArea());
      
      String config ="classpath:appCTX.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
      Circle circle1 = (Circle)ctx.getBean("circle");
      System.out.println("넓이:"+ circle1.getArea());
      
      Circle circle2 = (Circle)ctx.getBean("circle2");
      System.out.println("넓이:"+ circle2.getArea());
      
      Circle circle3 = (Circle)ctx.getBean("circle3");
      System.out.println("넓이:"+ circle3.getArea());
      System.out.println("====================");
      
      Student student = (Student) ctx.getBean("student1");
      System.out.println(student.getAge());
      System.out.println(student.getName());
      
      student.setAge("20살");
      student.setName("홍길순");
      System.out.println(student.getAge());
      System.out.println(student.getName());

   }
   
}