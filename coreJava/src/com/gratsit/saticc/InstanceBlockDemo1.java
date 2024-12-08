package com.gratsit.saticc;

class Aaa{
	int x;
	{
	   x=100;
	   System.out.println("Inside instance block");
	}
	static{
		System.out.println("Inside static block");
	}
	Aaa(){
		System.out.println("Inside constructor");
	}
}

public class InstanceBlockDemo1{
	public static void main(String[] args){
		Aaa a1=new Aaa();
		Aaa a2=new Aaa();
//		A a2=new A();
	}
}
