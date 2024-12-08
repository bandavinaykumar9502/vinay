package com.gratsit.varargs;

public class VarArgsDemo2 {

	public int sum(int a,int b){
		System.out.println(":sum1:");	
		return a+b;
	}
	
	public int sum(int... args){
		System.out.println(":sum2:");
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=args[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
		VarArgsDemo2 obj=new VarArgsDemo2();
		int sum1=obj.sum(2,3);
		System.out.println(sum1);	
		
		int sum2=obj.sum(2,3,50); 
		System.out.println(sum2);
//		
		int[] arr={15,25};
		int sum3=obj.sum(arr); 
		System.out.println(sum3);

	}

}
