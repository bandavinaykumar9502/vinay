package com.grats.finalkey;

public class FinalVarDemo{
	final int x; // Here gets the compilation error.
	public static void main(String[] args){
		FinalVarDemo obj=new FinalVarDemo();
		System.out.println(obj.x);
	}
}
