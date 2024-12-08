package com.grats.mapcollection;

import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap hashMapObj=new HashMap<>();
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.put(2348, "TCS");
		hashMapObj.put(555, "Wipro");
		hashMapObj.put(2344, "Accenture");
		hashMapObj.put(null, null);
		hashMapObj.put(34, "HCL");
		hashMapObj.put(2345, "JKT");
		hashMapObj.put(6456, "Grats");
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.put(null, "Infosys");
		hashMapObj.put(2345, null);
		hashMapObj.put(555, null);
		System.out.println(":hashMapObj:"+hashMapObj);
		Object obj = hashMapObj.put(1009, "Oracle");
		System.out.println(":obj:"+obj);
		obj = hashMapObj.put(1009, "PRK Software");
		System.out.println(":obj:"+obj);
		System.out.println(":hashMapObj:"+hashMapObj);
	}
}