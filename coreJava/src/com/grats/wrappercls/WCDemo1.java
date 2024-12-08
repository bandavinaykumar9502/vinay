package com.grats.wrappercls;

public class WCDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Primitive data types
		int number = 10;
		double doubleNumber = 3.14;
		System.out.println(":number:"+number);
		System.out.println(":doubleNumber:"+doubleNumber);
		
		// Using wrapper classes
		Integer number1 = new Integer(10);
		Double doubleNumber1 = new Double(3.14);
		System.out.println(":number1:"+number1);
		System.out.println(":doubleNumber1:"+doubleNumber1);
	}

}
