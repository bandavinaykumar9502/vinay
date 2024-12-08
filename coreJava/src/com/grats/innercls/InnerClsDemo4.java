package com.grats.innercls;

 class Outer4 {
	int x = 10;
	class Inner4 {
		int x = 100;
		public void method1() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer4.this.x);
		}
	}
}
public class InnerClsDemo4 {
	public static void main(String[] args) {
		Outer4.Inner4 obj = new Outer4().new Inner4();
		obj.method1();
	}
}
