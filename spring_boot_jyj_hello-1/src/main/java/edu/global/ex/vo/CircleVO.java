package edu.global.ex.vo;

import lombok.Data;

@Data
public class CircleVO {
	
	private int cir;
	static final double PI = 3.1415;
	
//	public void showPerimeter() {
//	      double peri = (cir * 2) * PI;
//	      System.out.println("둘레: " + peri);
//	}

   public double getArea() {
      double area = (cir * cir) * PI;
      return area;
   }
}

///////////////////////////////////////////////////////////////
class CircleVO2 { // 선생님꺼
	
	private double radius; // input_circle.jsp 의 name을 radius로 변경해야 작동된다

   public double getArea() {
      double setArea = (radius* radius) * 3.14;
      return setArea;
   }
}