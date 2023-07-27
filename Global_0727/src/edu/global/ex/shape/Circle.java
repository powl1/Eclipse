package edu.global.ex.shape;

import javax.servlet.http.HttpServlet;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
