package com.grats.exception;


public class ExceptionHndlDemo6 {
	public static void main(String[] args) {
		int a=100;
		int[] arr= {3,2,23,434};
		try {
			int b=a/4;
			int c=arr[2];
//			Class.forName("com.grats.exception.ExceptionHndlDemo1");
			Class.forName("com.grats.st.variable.Company");
		}catch(ArithmeticException ex) {
			System.out.println("===>ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println("====?ArrayIndexOutOfBoundsException");
		}catch(ClassNotFoundException ex) {
			System.out.println("====?ClassNotFoundException ");
		}
	}
}
