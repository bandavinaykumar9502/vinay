package com.grats.object;

class A {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A();
		A a2 = (A) a1.clone();
	}
}
