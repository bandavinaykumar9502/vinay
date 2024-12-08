package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList namesList=new ArrayList(100);
		namesList.add("Sachin");
		namesList.add("Sehwag");
		namesList.add("Dhoni");
		namesList.add("Rohit Sharma");
		namesList.add("Sehwag");
		namesList.add("Ganguly");
		namesList.add("Jadeja");
		namesList.add("Sachin");
		namesList.add("Kohli");
		System.out.println(":namesList:"+namesList);
		
		ArrayList namesList2=new ArrayList(namesList);
		System.out.println(":namesList2:"+namesList2);
		
//		ArrayList professionList=new ArrayList();
//		professionList.add("Sales");
//		professionList.add("Sales");
//		professionList.add("Sales");
//		namesList2.addAll(professionList);
//		System.out.println(":namesList2:"+namesList2);
		
	}
}
