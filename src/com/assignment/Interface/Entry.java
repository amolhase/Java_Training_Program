package com.assignment.Interface;

public class Entry {
	
	public static void main(String[] args) {
		
		Vehicle obj = new Bus();
		String vehicleName = obj.vehicleName();
		System.out.println("Vehicle name " + vehicleName);
		
		int numberOfTyre = obj.numberOfTyre();
		System.out.println(vehicleName + " has " + numberOfTyre + " tyres");
		
		heavyvehicle obj2 = new Bus();
		int numberOfPassanger = obj2.carryNumberOfPassanger();
		System.out.println(vehicleName + " carries " + numberOfPassanger + " passanger");
		
	}

}
