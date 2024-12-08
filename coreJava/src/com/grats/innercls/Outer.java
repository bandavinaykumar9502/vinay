package com.grats.innercls;

 public class Outer{
	public class Inner{
		int x=100;
		public void m1(){
			System.out.println("Inside inner m1():");
		}
	}
	public static void main(String[] args){
		System.out.println(":Inside Outer class main:");
//		Outer outer1=new Outer();
//		Outer.Inner inner1=outer1.new Inner();
//		inner1.m1();
//		System.out.println(":inner1.x:"+inner1.x);
		//or
//		Outer.Inner inner2=new Outer().new Inner();
//		inner2.m1();
//		System.out.println(":inner2.x:"+inner2.x);
//		//or
		new Outer().new Inner().m1();
	}
}
