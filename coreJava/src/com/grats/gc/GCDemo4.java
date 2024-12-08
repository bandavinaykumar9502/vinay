package com.grats.gc;

public class GCDemo4{	
	
	public static Student m2(){
		System.out.println(":m2:Start:");
		Student s1=new Student();
		Student s2=new Student();
		//st
		//st
		//st	
		System.out.println(":m2:End:");
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(":main:Start:");
		Student s=m2();
		//st
		//st
		//st
		System.out.println(":main:End:");						
	}
}