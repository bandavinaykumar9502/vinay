package com.grats.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalDemo {
//	public static void calculateIndex(String str) {
//		int hashcode=str.hashCode();
//		int index = hashcode & (capacity-1);
//		System.out.println(str+" "+hashcode+" "+index);
//	}
	private static int capacity=16;
	public static void calculateIndex(String str) {
		int hashcode=str.hashCode();
		// int hash=hash(hashCode);
		int index = hashcode % (capacity-1);
		index = index>=0? index: -1*index;
		System.out.println(str+":\t"+hashcode+":\t"+index);
	}
	private static void calculateIndex(Map mapObj) {
		for(Object key:mapObj.keySet()) {
			calculateIndex((String)key);
		}
	}
	public static void main(String[] args) {
		HashMap hashMapObj=new HashMap();
		hashMapObj.put("Grats", "1001"); 	//:hashcode:69063093	:index:3	
		hashMapObj.put("HCL", "1002");		//:hashcode:71345		:index:5
		hashMapObj.put("Exilant", "1002");	//:hashcode:349026545	:index:5
		hashMapObj.put("TCS", "1003");		//:hashcode:82884		:index:9
		hashMapObj.put("Wipro", "1004");	//:hashcode:83585659	:index:4
		hashMapObj.put("Accenture", "1005");//:hashcode:-115637186	:index:11	
		hashMapObj.put("JKT", "1006");		//:hashcode:73523		:index:8
		hashMapObj.put("Infosys", "1007");	//:hashcode:-684881089	:index:4
		hashMapObj.put("AWB", "1008");		//:hashcode:65228		:index:8
		hashMapObj.put("SAP", "1009");		//:hashcode:81858		:index:3
		hashMapObj.put("MRF", "1010");		//:hashcode:81858		:index:4
		calculateIndex(hashMapObj);
		System.out.println(":hashMapObj:"+hashMapObj);
	}
}
