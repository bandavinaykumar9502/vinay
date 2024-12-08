package com.grats.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("r"));
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("V"));
		System.out.println(t);
		t.add(434);
		t.add(45);
		t.add(23);
		t.add(72);
		t.add(3);
		t.add(6);
		t.add(7);
		System.out.println(t);
	}
}