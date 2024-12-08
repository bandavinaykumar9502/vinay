package com.grats.finalkey;

public class FinalLocVarDemo3{
	
	int sum(final int x,final int y){
//		x=400;//Compilation error
//		y=600;//Compilation error
		return x+y;
	}
	
	public static void main(String[] args){
		FinalLocVarDemo3 obj=new FinalLocVarDemo3();
		int sum=obj.sum(10,20);
		System.out.println(":sum:"+sum); 
	}
}	
