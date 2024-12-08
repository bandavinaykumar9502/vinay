package com.grats.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedListObj=new LinkedList();
		
		linkedListObj.add("Sachin");
		linkedListObj.add("Kohli");
		linkedListObj.add("sehwag");
		linkedListObj.add("Dhoni");
		linkedListObj.add("RohitSharma");
		linkedListObj.add("Ganguly");
		linkedListObj.add(2, "Dravid");
		System.out.println(":linkedListObj:"+linkedListObj);
		
		linkedListObj.addFirst("XYZ");
		linkedListObj.addLast("ABC");
		System.out.println(":linkedListObj:"+linkedListObj);
		linkedListObj.removeFirst();
		linkedListObj.removeLast();
		System.out.println(":linkedListObj:"+linkedListObj);
		System.out.println(":getFirst:"+linkedListObj.getFirst());
		System.out.println(":getLast:"+linkedListObj.getLast());
		
	}
}
