package edu.global.ex;

//빈 = 데이터 멤버에 대한 getter, setter + 디폴트 생성자 
public class Circle2 {
	static final double PI = 3.1415;
	private double radius;

	public Circle2() { // 얘를 빼먹으면 절대 ! 안됨 !!

	}

	public Circle2(double rad) {
		radius = rad;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레: " + peri);
	}

	public double getArea() {
		double area = (radius * radius) * PI;
		return area;
	}

	public static double getPi() {
		return PI;
	}
}