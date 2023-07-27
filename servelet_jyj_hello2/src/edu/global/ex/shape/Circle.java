package edu.global.ex.shape;


public class Circle { 
      static final double PI = 3.1415;
      private double radius;

      public Circle(double rad) {
         radius = rad;
      }

      public void showPerimeter() {
         double peri = (radius * 2) * PI;
         System.out.println("둘레: " + peri);
      }

      public double getArea() {
         double area = (radius * radius) * PI;
         return area;
      }
}