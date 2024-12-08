package com.grats.gc;

import java.util.Date;

public class GCRuntimeDemo1{
	public static void main(String[] args) {
		System.out.println(":main:Start:");
		
			Runtime runtime=Runtime.getRuntime();
			System.out.println(":1:freeMemory:"+runtime.freeMemory());
			System.out.println(":totalMemory:"+runtime.totalMemory());
//			Date[] dt=new Date[10000];
			for(int i=0;i<10000;i++) {
				Date dt=new Date();
				dt=null;
			}
			System.out.println(":2:freeMemory:"+runtime.freeMemory());
			runtime.gc();	
			System.out.println(":gc called:"+runtime.freeMemory());
////			System.out.println(":totalMemory:"+runtime.totalMemory());			
			System.out.println(":main:End:");							
	}
}