package com.gratsit.arrays;

class A{
	int i=100;
	void methodA(){
		System.out.println(":Inside methodA():");
	}
	
}

class B {
	int j=200;
	void methodB(){
		System.out.println(":Inside methodB():");
	}					
}

public class ArraysDemo8 {

	public static void main(String[] args) {		
		A[] aArr=new A[6];
		
//		for(int i=0;i<aArr.length;i++){
//			System.out.println(":"+aArr[i]);
//		}
		aArr[0]=new A();
		aArr[1]=new A();
		aArr[2]=new A();
//		for(int i=0;i<aArr.length;i++){
//			System.out.println(":"+aArr[i]);
//			A a1=aArr[i];
//			if(a1!=null) {
//				System.out.println(":"+a1.i);
//				a1.methodA();
//			}
//		}
//		aArr[0]=new B(); //This is not possible because array is type of A, so can assign A type objects
		
		Object[] objArr=new Object[4]; //This array is type of Object, so can assign any class object.
		objArr[0]=new A();
		objArr[1]=new B();
		objArr[2]=new String();
////		
		for(int i=0;i<objArr.length;i++){
			System.out.println(":"+objArr[i]);
		}
	}

}
