package com.grats.exception;

public class FinallyDemo5 {
	public static void main(String[] args) {
		try {
			System.out.println(":try:");
			System.exit(-10);
			System.out.println(":1:");
		}catch(Exception ex) {
			System.out.println(":catch:");
		}
		finally{
			System.out.println(":finally:");
		}	
		System.out.println(":End:");
	}
}
