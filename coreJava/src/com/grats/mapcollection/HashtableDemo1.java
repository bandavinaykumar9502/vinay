package com.grats.mapcollection;

import java.util.Hashtable;

public class HashtableDemo1 {
	public static void main(String[] args) {
		Hashtable hashtableObj=new Hashtable();
		hashtableObj.put(1001, "TCS");
		hashtableObj.put(456, "Wipro");
		hashtableObj.put(674, "HCL");
		hashtableObj.put(434, "Grats");
		hashtableObj.put(3443, "Accenture");
		hashtableObj.put(3454, "JKT");
//		hashtableObj.put(null, "asdfasd");
//		hashtableObj.put(3635, null);
		String compName=(String)hashtableObj.get(434);
		System.out.println(":compName:"+compName);
		System.out.println(":hashMapObj:"+hashtableObj);
	}
}
