package com.grats.collection;

import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector vector=new Vector();
		System.out.println(":capacity:"+vector.capacity());
		for(int i=1;i<=10;i++) {
			vector.addElement(i);
		}
		System.out.println(":vector:"+vector);
		System.out.println(":capacity:"+vector.capacity());
		vector.add(null);
		vector.add("P");
		System.out.println(":capacity:"+vector.capacity());
		System.out.println(":vector:"+vector);
	}
}