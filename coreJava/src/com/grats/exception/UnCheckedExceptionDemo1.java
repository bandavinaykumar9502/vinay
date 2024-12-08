package com.grats.exception;

public class UnCheckedExceptionDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="123";
		String num2="10";
//		System.out.println(":sum:"+num1+num2);//12310yd
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
		System.out.println(":sum:"+sum);
	}
}
