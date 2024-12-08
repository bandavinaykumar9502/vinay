package com.grats.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap hashMapObj = new HashMap();
		hashMapObj.put(1001, "TCS");
		hashMapObj.put(1002, "Wipro");
		hashMapObj.put(null, null);
		hashMapObj.put(1003, "HCL");
		hashMapObj.put(1004, "Grats");
		hashMapObj.put(1005, "Accenture");
		hashMapObj.put(1006, "JKT");
		hashMapObj.put(null, "Infosys");
		hashMapObj.put(1007, null);
		hashMapObj.put(1008, null);
		hashMapObj.put(1009, "Oracle");
//		System.out.println(":hashMapObj:" + hashMapObj);

		Set keys = hashMapObj.keySet();
//		System.out.println(":keys:" + keys);
		Collection values = hashMapObj.values();
//		System.out.println(":values:" + values);
		Set entrySet = hashMapObj.entrySet();
		System.out.println(":entrySet:" + entrySet);
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(":key:" + entry.getKey() + ":value:" + entry.getValue());
			if (entry.getKey() != null && entry.getKey().equals(1006)) {
				entry.setValue("HUL");
			}
		}
		System.out.println(":hashMapObj:" + hashMapObj);
	}
}