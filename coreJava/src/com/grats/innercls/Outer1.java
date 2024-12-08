package com.grats.innercls;

public class Outer1{
	public class Inner1{
		public void m1(){
			System.out.println("Inside inner m1():");
		}
	}
	
	public void m2(){
		System.out.println("Inside Outer1 m2():");
		Inner1 i1=new Inner1();
		i1.m1();
	}
	
	public static void main(String[] args){
		Outer1 outerObj=new Outer1();
		outerObj.m2();
	}
}
