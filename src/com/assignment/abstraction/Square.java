package com.assignment.abstraction;

public class Square extends Shape{

	private Integer side;
	
	public Square() {
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;	
	}
	
}
