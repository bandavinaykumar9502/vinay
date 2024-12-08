package com.grats.finalkey;

public class FinalLocVarDemo2{
	public static void main(String[] args){
		final int x;
		x=500;
		System.out.println(":x:"+x);		
		//or
		final int y=600;
		System.out.println(":y:"+y); 
//		y=700; //Compile time error
	}
}