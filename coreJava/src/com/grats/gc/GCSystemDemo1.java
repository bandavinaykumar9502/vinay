package com.grats.gc;

public class GCSystemDemo1{
	public static void main(String[] args) {
		System.out.println(":main:Start:");
		Student st1=new Student();
		st1=null;
		System.gc();
		System.out.println(":main:End:");
	}
}
