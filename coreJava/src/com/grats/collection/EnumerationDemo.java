package com.grats.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=0;i<20;i++) {
			v.add(i*10);
		}
//		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
		}
		System.out.println(v);
	}
}
