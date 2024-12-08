package com.grats.collection;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector=new Vector(5);
		System.out.println(":capacity:"+vector.capacity());
		for(int i=1;i<=5;i++) {
			vector.addElement(i);
		}
		System.out.println(":capacity:"+vector.capacity());
		vector.add("P");
		System.out.println(":capacity:"+vector.capacity());
		System.out.println(":vector:"+vector);
	}

}
