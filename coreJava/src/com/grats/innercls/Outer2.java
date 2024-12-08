package com.grats.innercls;

public class Outer2 {
	public class Inner2 {
		static int x = 100; // static variable can't declare inside inner class
		public void m1() {
			System.out.println("Inside inner m1():");
		}
		public static void main(String[] args) { // static method can't declare inside inner class, even main method
													// also not possible.
		}
		public static void m3() { // static method can't declare inside inner class
		}
	}
	public static void main(String[] args) {
		System.out.println(":Inside Outer class main:");
	}
}
