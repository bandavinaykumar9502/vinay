package com.grats.exception;

public class ExceptionHndlDemo3 {
	public static void main(String[] args) {
		try{
			System.out.println(":Statement1:");
			System.out.println(":Statement2:");
			System.out.println(":Statement3:");
		}catch(ArithmeticException aex){
			System.out.println(":Statement4:");
		}
		System.out.println(":Statement5:");
	}
}