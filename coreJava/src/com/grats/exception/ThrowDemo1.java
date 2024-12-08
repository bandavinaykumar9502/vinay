package com.grats.exception;

public class ThrowDemo1 {
	public static void main(String[] args){
		System.out.println(":main:start:");
		int a=10,b=0,c;
		if(b!=0){
			c=a/b;
		}else{
//			c=a/b;
			throw new ArithmeticException("You can't divide a number by zero. Please correct value."); //exception is handing over to caller(i.e., JVM).
		}	
		System.out.println(":main:end:");
	}
}