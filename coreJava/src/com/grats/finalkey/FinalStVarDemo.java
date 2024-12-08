package com.grats.finalkey;

public class FinalStVarDemo{
	static final int x; // Here gets the compilation error.
	public static void main(String[] args){
		FinalStVarDemo obj=new FinalStVarDemo();
		System.out.println(obj.x);
	}
}
