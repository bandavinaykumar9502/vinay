package com.grats.gc;

public class GCDemo3{
	
	public  static void m1(){
		System.out.println(":m1:Start:");	
			Student s1=new Student();
			Student s2=new Student();
		//st
		//st
		//st
		System.out.println(":m1:End:");						
	}

	public static void main(String[] args) {
		System.out.println(":main:Start:");
		m1();
		System.out.println(":main:End:");
	}
}
