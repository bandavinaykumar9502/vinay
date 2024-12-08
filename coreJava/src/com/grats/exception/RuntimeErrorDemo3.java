package com.grats.exception;

public class RuntimeErrorDemo3 {
	public static void main(String[] args) {
		String str=null;
		String str1=str.concat("Hello");
		System.out.println(":str1:"+str1);//
	}
}
