package com.grats.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		ArrayList namesList=new ArrayList();
		namesList.add("Sachin");
		namesList.add("Kohli");
		namesList.add(14);
		namesList.add("sehwag");
		namesList.add("Dhoni");
		namesList.add(14);
		namesList.add("RohitSharma");
		namesList.add("Ganguly");
		namesList.add(2, "Dravid");
		namesList.remove("sehwag");
		namesList.add("Dhoni");
		namesList.add("Sachin");
		System.out.println(":namesList:"+namesList);
		
		HashSet uniqueELements=new HashSet(namesList);
		System.out.println(":uniqueELements:"+uniqueELements);
	}
}