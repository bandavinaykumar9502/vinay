package com.grats.innercls;

class Outer3{
	int x=10;
	static int y=20;
	class Inner3{
		public void method1(){
			System.out.println(x);
			System.out.println(y);
			method2() ;
		}
	}
	void method2() {
		System.out.println("Inside outer method2()");
	}
}

public class InnerClsDemo3{
	public static void main(String[] args) {
		Outer3.Inner3 obj=new Outer3().new Inner3();
		obj.method1();
	}				
}		