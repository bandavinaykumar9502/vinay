package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1001);
		al.add("Grats");
		al.add(5000.00);
		al.add(null);
		al.add("Grats");
		al.add(1001);
		System.out.println(":al:"+al); //[ 1001,Grats,5000.00,null,Grats ]
	}
}
