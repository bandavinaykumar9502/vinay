package com.grats.gc;

class Student{
	int i=100;
}

public class GCDemo1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":main:Start:");
		Student s1=new Student();
		Student s2=new Student();
		//st
		//st
		//st
		s1=null;
		//st
		//st
		//st
		s2=null;	
		System.out.println(":main:End:");
	}
}