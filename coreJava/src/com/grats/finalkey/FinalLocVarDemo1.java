package com.grats.finalkey;

public class FinalLocVarDemo1{
	public static void main(String[] args){
		final int x;
		System.out.println(":x:"+x); // Compilation Error: The local variable x may not have been initialized
	}
}
