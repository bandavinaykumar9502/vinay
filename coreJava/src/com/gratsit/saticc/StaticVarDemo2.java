package com.gratsit.saticc;

class A{
	static int counter;
	A(){
		counter+=1;
	}
	void printObjectsCreatedCount() {
		System.out.println(":counter:"+counter);
	}
}

public class StaticVarDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a3.printObjectsCreatedCount();
	}
}
