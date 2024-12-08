package com.grats.exception;

public class UnreachableBlockDemo1 {
	public static void main(String[] args) {
		int a=100;
		int[] arr= {3,2,23,434};
		try {
			int b=a/0;
			int c=arr[6];
			Class.forName("com.grats.st.variable.Company");
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
//		catch(Exception ex1) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		}
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException ");
		}catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}	