package com.grats.mapcollection;

import java.util.HashMap;
import java.util.WeakHashMap;

class Test{
//	@Override
//	public String toString() {
//		return "Test";
//	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(":Test:finalize():called:");
	}
}
public class WeakHashMapDemo1 {
	public static void main(String[] args) throws InterruptedException {
		Test t1=new Test();
		HashMap m1=new HashMap();
		m1.put(t1, "Grats IT");
		System.out.println("========>:m1:"+m1);
		t1=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println("========>:m1:"+m1);
		
		Test t2=new Test();
		WeakHashMap m2=new WeakHashMap();
		m2.put(t2, "Grats IT");
		Test t3=new Test();
		m2.put(t3, "Infosys IT");
		System.out.println(":m2:"+m2);
		t2=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(":m2:"+m2);
	}
}