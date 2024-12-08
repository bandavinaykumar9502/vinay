package com.gratsit.varargs;

public class VarArgsDemo1 {
	public int sum(int a,int b){
		return a+b;
	}
	
//	public int sum(int... args){
//		System.out.println(":sum2:");
//		int sum=0;
//		for(int i=0;i<args.length;i++) {
//			sum+=args[i];
//		}
//		return sum;
//	}
	
	public static void main(String[] args) {
	
		VarArgsDemo1 obj=new VarArgsDemo1();
		int sum1=obj.sum(2,3);
		System.out.println(sum1);	
		
//		int sum2=obj.sum(3,34,242,24); // This is not possible because sum method have 2 parameters only, but here passing 3 arguments.
//		System.out.println(sum2);

	}
}
