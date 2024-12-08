package com.grats.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("K");
		t.add("X");
		t.add("R");
		t.add("r");
		t.add("X");
		t.add("a");
		t.add("Z");
		t.add("V");
		System.out.println(t);
//		t.add(14);	//ClassCastException
		t.add(null);	//NullPointerException
	}
}
