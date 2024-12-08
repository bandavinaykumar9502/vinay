package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1001);
		al.add("Grats");
		al.add(5000.00);
		al.add(null);
		al.add("Grats");	
		System.out.println(":al:"+al); 
		System.out.println(":al.get(0):"+al.get(0)); 
		System.out.println(":al.get(1):"+al.get(1)); 
		System.out.println(":al.get(2):"+al.get(2));
		al.add(1,"Wipro");
		System.out.println(":al:"+al); 
		al.set(1, "Infosys");
		System.out.println(":al:"+al);	 
		System.out.println(":size:"+al.size());	
		System.out.println(":isEmpty:"+al.isEmpty());	 
//		al.clear();
		System.out.println(":al:"+al);	 
		System.out.println(":size:"+al.size());	
		System.out.println(":isEmpty:"+al.isEmpty());	 
		al.remove(4);
		System.out.println(":al:"+al);	
		al.remove("Wipro");
		System.out.println(":al:"+al);	
		System.out.println(":contains:"+al.contains("Infosys"));	
	}
}
