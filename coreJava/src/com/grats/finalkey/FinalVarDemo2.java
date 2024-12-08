package com.grats.finalkey;

public class FinalVarDemo2{
	final int x;
	
	{
		x=200;
//		x=300;
	}
	
	public static void main(String[] args){
		FinalVarDemo2 obj=new FinalVarDemo2();
		System.out.println(obj.x);
//		obj.x=700;
	}
}
