package com.grats.innercls;

class Outer6 {
	public void method1() {
		class Inner6 {
			public int sum(int a, int b) {
				return a + b;
				
			}
		}
		Inner6 i1 = new Inner6();
		System.out.println(i1.sum(10, 100));
		System.out.println(i1.sum(10, 200));
		System.out.println(i1.sum(100, 300));
		System.out.println(i1.sum(100, 400));
	}
}
public class InnerClsDemo6 {
	public static void main(String[] args) {
		Outer6 obj = new Outer6();
		obj.method1();
	}
}
