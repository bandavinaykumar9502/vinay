package com.grats.exception;

public class ExceptionHndlDemo5 {
	public static void main(String[] args) {
		
		int a = 100,b=0,c;
		String msg;
		int[] arr = new int[5];
		try {
			c = a / b;
			System.out.println(":c:" + c);
			try {
				System.out.println(arr[4]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid index used to read array");
			}
		} catch (ArithmeticException e) {
			System.out.println("Calculation Error");
		} 
	}
}
