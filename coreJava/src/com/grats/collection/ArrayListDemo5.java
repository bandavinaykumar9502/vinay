package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {
//		ArrayList namesList1=new ArrayList();
//		namesList1.add("Sachin");
//		namesList1.add("Sehwag");
//		namesList1.add("Dhoni");
//		namesList1.add(152);
//		System.out.println(":namesList:"+namesList1);
//		for(Object name:namesList1) {
//			String nm=(String)name;
//			System.out.println(":nm:"+nm);
//		}
		
		ArrayList<String> namesList2=new ArrayList<>();
		namesList2.add("Sachin");
		namesList2.add("Sehwag");
		namesList2.add("Dhoni");
//		namesList2.add(152);
		System.out.println(":namesList2:"+namesList2);
		for(String name:namesList2) {
			System.out.println(":name:"+name);
		}
	}
}
