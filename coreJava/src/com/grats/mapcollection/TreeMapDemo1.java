package com.grats.mapcollection;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		HashMap hashMapObj=new HashMap();
		hashMapObj.put(434, "Grats");
		hashMapObj.put(674, "HCL");
		hashMapObj.put(532, "TCS");
		hashMapObj.put(456, "Wipro");
		hashMapObj.put(23, "Accenture");
		hashMapObj.put(3454, "JKT");
		System.out.println(":hashMapObj:"+hashMapObj);
		
		TreeMap treeMapObj=new TreeMap();
//		treeMapObj.put(null, "sdfd");
		treeMapObj.put(434, "Grats");
		treeMapObj.put(674, "HCL");
		treeMapObj.put(532, "TCS");
		treeMapObj.put(456, "Wipro");
		treeMapObj.put(23, "Accenture");
		treeMapObj.put(3454, "JKT");
		treeMapObj.put(5656, null);
		treeMapObj.put(4565, null);
//		treeMapObj.put("A", "PVR");
		System.out.println(":treeMapObj:"+treeMapObj);
		System.out.println(":firstKey:"+treeMapObj.firstKey());
		System.out.println(":lastKey:"+treeMapObj.lastKey());
		System.out.println(":headMap:"+treeMapObj.headMap(674));
		System.out.println(":tailMap:"+treeMapObj.tailMap(674));
		System.out.println(":subMap:"+treeMapObj.subMap(456,3454));
		System.out.println(":comparator:"+treeMapObj.comparator());
	}
}
