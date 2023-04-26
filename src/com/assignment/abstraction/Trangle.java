package com.assignment.abstraction;

public class Trangle extends Shape {

	private Integer base;
	private Integer height;
	
	public Trangle() {	
	}
	
	public Trangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	
	
	
	
}
