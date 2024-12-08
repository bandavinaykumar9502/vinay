package com.grats.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector=new Vector(5,20);
		System.out.println(":capacity:"+vector.capacity());
		for(int i=1;i<=5;i++) {
			vector.addElement(i);
		}
		System.out.println(":capacity:"+vector.capacity());
//		vector.add("P");
		System.out.println(":capacity:"+vector.capacity());
		System.out.println(":vector:"+vector);
		
//		Enumeration e=vector.elements();
//		while(e.hasMoreElements()) {
//			int x=(int)e.nextElement();
//			System.out.println(x);
//			if(x==5) {
//				vector.add(10);
//			}
//		}
		
		Iterator itr=vector.iterator();
		while(itr.hasNext()) {
			int x=(int)itr.next();
			System.out.println(x);
			if(x==5) {
				vector.add(10);
			}
		}
		
	}

}
