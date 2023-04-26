package com.assignment.abstraction;

public class Entry {
	
	public static void main(String[] args) {
		
		Shape arr[] = new Shape[7];
		
		arr[0] = new Square(12);
		arr[1] = new Trangle(5,8);
		arr[2] = new Square(3);
		arr[3] = new Square(54);
		arr[4] = new Trangle(6,8);
		arr[5] = new Circle(7);
		arr[6] = new Circle(12);
		
		double totalArea = 0.0;
		
		for(Shape s:arr) {
			totalArea = totalArea + s.calculateArea();
			System.out.println(" Area : " + s.calculateArea());
		}
		
		System.out.println("Total area of all objects are " + totalArea);
		
	}

}
