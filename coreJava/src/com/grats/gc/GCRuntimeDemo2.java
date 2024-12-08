package com.grats.gc;

class Employee {
	int empId=1001;
	String name=new String("Hi");
	protected void finalize(){
		System.out.println(":finalize:");	
	}
}
public class GCRuntimeDemo2{
	public static void main(String[] args) throws InterruptedException {
		System.out.println(":main:Start:");
			Runtime runtime=Runtime.getRuntime();
			System.out.println(":1:freeMemory:"+runtime.freeMemory());
			
//			System.out.println(":totalMemory:"+runtime.totalMemory());
			for(int i=0;i<10;i++) {
				Employee emp=new Employee();
				System.out.println(":emp:"+emp);
				emp=null;
			}
			System.out.println(":2:freeMemory:"+runtime.freeMemory());
			runtime.gc();
			Thread.sleep(4000);
			
			System.out.println(":3:freeMemory:"+runtime.freeMemory());
//			System.out.println(":totalMemory:"+runtime.totalMemory());			
			System.out.println(":main:End:");							
	}
}