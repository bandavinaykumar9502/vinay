package com.grats.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector=new Vector();
		
		Enumeration e=vector.elements();
		Iterator itr=vector.iterator();
		ListIterator lstItr=vector.listIterator();
		
		System.out.println(":Enumeration Impl Class:"+e.getClass().getName());
		System.out.println(":Iterator Impl Class:"+itr.getClass().getName());
		System.out.println(":ListIterator Impl Class:"+lstItr.getClass().getName());
	}
}
