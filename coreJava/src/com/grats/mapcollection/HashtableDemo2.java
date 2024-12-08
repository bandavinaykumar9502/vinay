package com.grats.mapcollection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo2 {
	public static void main(String[] args) {
		Hashtable hashtableObj=new Hashtable();
		hashtableObj.put(1001, "TCS");
		hashtableObj.put(456, "Wipro");
		hashtableObj.put(674, "HCL");
		hashtableObj.put(434, "Grats");
		hashtableObj.put(3443, "Accenture");
		hashtableObj.put(3454, "JKT");
		String compName=(String)hashtableObj.get(434);
		System.out.println(":compName:"+compName);
		System.out.println(":hashMapObj:"+hashtableObj);
		
		Set keys=hashtableObj.keySet();
		System.out.println(":keys:"+keys);
		for(Object key:keys) {
			System.out.println(":key:"+key+":value:"+hashtableObj.get(key));
		}
		Collection c=hashtableObj.values();
		for(Object val:c) {
			System.out.println(":value:"+val);
		}
		System.out.println(":===========================================>:");
		Set entrySet=hashtableObj.entrySet();
		for(Object entry:entrySet) {
			System.out.println(":key:"+((Map.Entry)entry).getKey()+":value:"+((Map.Entry)entry).getValue());
		}
	}
}
