package com.grats.finalkey;

public class FinalVarDemo3{
	final int x;
	FinalVarDemo3(){
		x=300;
//		x=500;
	}
	FinalVarDemo3(int x){
		this.x=x;
//		this.x=500;
	}
	public static void main(String[] args){
		FinalVarDemo3 obj=new FinalVarDemo3();
		System.out.println(obj.x);
		
		FinalVarDemo3 obj1=new FinalVarDemo3(500);
		System.out.println(obj1.x);
	}
}
