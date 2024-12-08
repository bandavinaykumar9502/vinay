package com.gratsit.varargs;

public class VarArgsDemo3 {

//	public int sum(String name) {
//		System.out.println("name:"+name);
//		int sum=0;
//		for(int i=0;i<args.length;i++) {
//			sum+=args[i];
//		}
//		return sum;
//	}
	
//	public int sum(String name,int[] args) {
//		System.out.println("name:"+name);
//		int sum=0;
//		for(int i=0;i<args.length;i++) {
//			sum+=args[i];
//		}
//		return sum;
//	}

	public int sum(String name,int... args) {
		System.out.println("name:"+name);
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=args[i];
		}
		return sum;
	}						

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {24,345,4,2,};
		
		VarArgsDemo3 obj=new VarArgsDemo3();
		int sum1=obj.sum("sum",23,34,45,2234,534);
		int sum2=obj.sum("sum",new int[] {23,24,3634,324});
		System.out.println(sum1);
		System.out.println(sum2);
		int sum3=obj.sum("sum",nums);
		System.out.println(sum3);
	}

}
