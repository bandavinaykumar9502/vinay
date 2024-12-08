package com.grats.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList namesList=new ArrayList();
		namesList.add("Sachin");
		namesList.add("Sehwag");
		namesList.add("Ganguly");
		namesList.add("Dravid");
		namesList.add("Yuvaraj");
		System.out.println(namesList);
		
		ListIterator lstItr=namesList.listIterator();
		while(lstItr.hasNext()) {
			String name=(String)lstItr.next();
			System.out.println("1:name:"+name+":nextIndex:"+lstItr.nextIndex());
			if(name.equals("Dravid")) {
				lstItr.add("Dhoni");
				System.out.println(":previousIndex:"+lstItr.previousIndex());
				System.out.println(":previous:"+lstItr.previous());
				System.out.println(":hasPrevious:"+lstItr.hasPrevious());
			}
			if(name.equals("Sehwag")) {
				lstItr.set("RohitSharma");
			}
			if(name.equals("Yuvaraj")) {
				lstItr.remove();
			}
		}
		System.out.println(namesList);
	}
}

