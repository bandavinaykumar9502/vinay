package com.grats.mapcollection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMapObj = new HashMap();
		hashMapObj.put("434", "Grats");
		hashMapObj.put("674", "HCL");
		hashMapObj.put("532", "TCS");
		hashMapObj.put("456", "Wipro");
		hashMapObj.put("23", "Accenture");
		hashMapObj.put("3454", "JKT");
		System.out.println(":hashMapObj:" + hashMapObj);
		
		LinkedHashMap linkedHashMapObj = new LinkedHashMap();
		linkedHashMapObj.put("434", "Grats");
		linkedHashMapObj.put("674", "HCL");
		linkedHashMapObj.put("532", "TCS");
		linkedHashMapObj.put("456", "Wipro");
		linkedHashMapObj.put("23", "Accenture");
		linkedHashMapObj.put("3454", "JKT");
		System.out.println(":linkedHashMapObj:" + linkedHashMapObj);
	}
}
