package com.grats.exception;

public class RuntimeStackDemo1{
	
	public static void main(String[] args) {
		System.out.println(":main:start:");
		m1();
		System.out.println(":main:end:");
	}
	
	public static void m1(){
		System.out.println(":m1:start:");
		m2();
		
		System.out.println(":m1:end:");
	}
	
	public static void m2(){
		System.out.println(":m2:start:");
		m3();
		int i=10;
		int j=0;
		System.out.println(":i:"+i+":j:"+j);
		int d=i/j; // 10/0
		System.out.println(":d:"+d);
		System.out.println(":m2:end:");
	}
	
	public static void m3(){
		System.out.println(":m3:start:");

		System.out.println(":m3:end:");
	}
}
