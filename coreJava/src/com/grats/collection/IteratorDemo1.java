package com.grats.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=0;i<20;i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			System.out.print(i+" ");
		}
//		
		System.out.println("=============================== ");
		//remove the odd numbers from list.
		Iterator itr1=al.iterator();
		while(itr1.hasNext()) {
			Integer i=(Integer)itr1.next();
			if(i%2!=0)
				itr1.remove();
		}
		System.out.println(al);
		
	}
}