package com.javalec.ex.pencil;

public class Pencil6BWithErase extends Pencil6B implements Pencil {

   @Override
   public void use() {
	   super.use();
      System.out.println("6B에, 지우개가 있습니다.");
   }
   
}