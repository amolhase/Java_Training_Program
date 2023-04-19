package com.Assignment.Calculator;

import java.io.IOException;

public class Entry {

	public static void main(String[] args) throws IOException {
		
		int choice;
		int number1 = 0;
		int number2 = 0;
		do {
			Menu menu = new Menu();
			choice = menu.show();
			
			if(choice < 5) {
				System.out.println("Enter first Number");
				 number1 = BasicInput.readInteger();
				
				System.out.println("Enter Second Number");
				 number2 = BasicInput.readInteger();
			}
			
			Maths m = new Maths();
			switch(choice) {
			case 1:
				   m.add(number1, number2);
			       break;
			case 2:
				   m.substract(number1, number2);
				   break;
			case 3:
				   m.multiplication(number1, number2);
				   break;
			case 4:
				   m.division(number1, number2);
				   break;
			case 5:
				   System.exit(0);
				   break;
			default:
				   System.out.println("Please Enter a valid choice");
				   break;
			}
		}while(choice != 5);
			
		
	}
	
}
