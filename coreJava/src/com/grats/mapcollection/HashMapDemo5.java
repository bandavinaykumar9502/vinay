package com.grats.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo5 {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMapObj = new HashMap<>();
		hashMapObj.put(1001, "TCS");
		hashMapObj.put(1002, "Wipro");
		hashMapObj.put(1003, "HCL");
		hashMapObj.put(1004, "Grats");
//		hashMapObj.put("asdf", 34234);
		System.out.println(":hashMapObj:" + hashMapObj);
		Set<Integer> keys = hashMapObj.keySet();
		System.out.println(":keys:" + keys);
		Collection<String> values = hashMapObj.values();
		System.out.println(":values:" + values);
		for (Map.Entry<Integer, String> entry : hashMapObj.entrySet()) {
			int id  = entry.getKey();
			String name = entry.getValue();
			System.out.println(":id:"+id+":name:"+name);
		}
	}
}