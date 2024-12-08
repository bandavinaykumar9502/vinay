package com.grats.mapcollection;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMapObj=new HashMap();
		hashMapObj.put("434", "Grats");
		hashMapObj.put("674", "HCL");
		hashMapObj.put("532", "TCS");
		hashMapObj.put("456", "Wipro");
		hashMapObj.put("23", "Accenture");
		hashMapObj.put("3454", "JKT");
		
		Boolean flag1=hashMapObj.containsKey("454434");
		System.out.println(":flag1:"+flag1);
		Boolean flag2=hashMapObj.containsValue("Accenture12");
		System.out.println(":flag2:"+flag2);
		System.out.println(":hashMapObj:"+hashMapObj);
		Boolean flag5=hashMapObj.isEmpty();
		System.out.println(":isEmpty:"+flag5);
		hashMapObj.clear();
		System.out.println(":hashMapObj:"+hashMapObj);
		Boolean flag3=hashMapObj.containsKey("434");
		System.out.println(":flag3:"+flag3);
		Boolean flag4=hashMapObj.containsValue("Accenture");
		System.out.println(":flag4:"+flag4);
		Boolean flag6=hashMapObj.isEmpty();
		System.out.println(":isEmpty:"+flag6);
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.put("1001", "CTS");
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.remove("1001");
		System.out.println(":hashMapObj:"+hashMapObj);
	}
}