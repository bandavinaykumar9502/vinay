package com.grats.wrappercls;

public class WCDemo5 {

	public static void main(String[] args) {
		String str="52654";
//		int number = str; //compilation error
		int number = Integer.parseInt(str);
		System.out.println(":number:"+number);
		
		String str1="14.30";
//		double number1 = str1; //compilation error
		double number1 = Double.parseDouble(str1);
		System.out.println(":number1:"+number1);

	}

}
