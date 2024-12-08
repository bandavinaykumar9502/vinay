package com.grats.exception;

public class ExceptionHndlDemo4 {
	public static void main(String[] args) {
		try{
			System.out.println(":Statement1:");
			System.out.println((10/0));
			System.out.println(":Statement2:");
		}catch(ArithmeticException aex){
//			aex.printStackTrace();
//			System.out.println(":aex1:"+aex);
//			System.out.println(":aex2:"+aex.toString());
//			System.out.println(":aex3:"+aex.getMessage());
			System.out.println(":Inside catch block:");
		}
	}
}	
