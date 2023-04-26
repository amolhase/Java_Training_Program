package com.assignment.abstraction;

public class Circle extends Shape {
	
	private Integer radius;
	
	public Circle() {
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}
	

}
