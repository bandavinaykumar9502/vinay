package com.grats.exception;

public class FinallyDemo3 {
	public static void main(String[] args) {
		int[] arr= {3,2,23,434};
		try {
			System.out.println(":try:");
			int c=arr[5];
			System.out.println(":c:"+c);
		}catch(ArithmeticException ex) {
			System.out.println(":catch:");
		}finally{
			System.out.println(":finally:");
		}	
		System.out.println(":End:");
	}
}