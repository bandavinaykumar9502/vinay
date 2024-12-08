package com.grats.finalkey;


public class FinalStVarDemo2{
	static final int x;
	
	static{
		x=200;
	}
	
	public static void main(String[] args){
//		FinalStVarDemo2 obj=new FinalStVarDemo2();
//		System.out.println(obj.x);
		System.out.println(FinalStVarDemo2.x);
//		FinalStVarDemo2.x=5900;
	}
}
