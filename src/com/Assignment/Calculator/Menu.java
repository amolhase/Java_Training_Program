package com.Assignment.Calculator;

import java.io.IOException;

public class Menu {
	
	public int show() throws IOException {
		System.out.println("1.Add");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		
		System.out.println("Please Enter your choice");
		int i = BasicInput.readInteger();
		
		return i;
	}

}
