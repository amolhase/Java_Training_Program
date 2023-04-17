package com.Assignment.Calculator;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("Addition --> " + (a+b));
	}
	
	public void substract(int a, int b) {
		System.out.println("Substraction --> " + (a-b));
	}
	
	public void multiplication(int a, int b) {
		System.out.println("Multiplication --> " + (a*b));
	}
	
	public void division(int a, int b) {
		System.out.println("Division --> " + (a/b));
	}
	
	public void square(int a) {
		System.out.println("Square --> " + (a*a));
	}
	
	public void cube(int a) {
		System.out.println("Cube --> " + (a*a*a));
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(11, 22);
		c.substract(100, 89);
		c.multiplication(9, 23);
		c.division(786, 9);
		c.square(18);
		c.cube(13);
	}
	
}
