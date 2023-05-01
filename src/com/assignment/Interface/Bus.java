package com.assignment.Interface;

public class Bus implements Vehicle, heavyvehicle {

	@Override
	public int numberOfTyre() {
		return 6;
	}

	@Override
	public String vehicleName() {
		return "Bus";
	}

	@Override
	public int carryNumberOfPassanger() {
		return 45;
	}
	
	

}
