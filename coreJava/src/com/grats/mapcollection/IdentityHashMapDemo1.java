package com.grats.mapcollection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo1 {
	public static void main(String[] args) {
		Integer i1=new Integer(20);
		Integer i2=new Integer(20);
		System.out.println(i1==i2);//false	
		System.out.println(i1.equals(i2));//true
		
		HashMap m1=new HashMap();
		m1.put(i1,"Sachin");
		System.out.println(m1);//20=Sachin
		m1.put(i2,"Sehwag");	//
		System.out.println(m1);//20=Sehwag
		
		IdentityHashMap m2=new IdentityHashMap();
		m2.put(i1,"Sachin");
		System.out.println(m2);
		m2.put(i2,"Sehwag");	
		System.out.println(m2);
		Integer i3=i1;
		m2.put(i3,"Kohli");
		System.out.println(m2);
	}
}