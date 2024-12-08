package com.grats.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
	public static void main(String[] args) {
		LinkedHashSet linkedHashSetObj=new LinkedHashSet();
		linkedHashSetObj.add("Grates IT Services");
		linkedHashSetObj.add("HCL");
		linkedHashSetObj.add(null);
		linkedHashSetObj.add(24234);
		linkedHashSetObj.add("Infosys");
		linkedHashSetObj.add("Wipro");
		System.out.println(":linkedHashSetObj:"+linkedHashSetObj);
		boolean flag=linkedHashSetObj.add("Infosys");
		System.out.println(":flag:"+flag);
		boolean flag1=linkedHashSetObj.add("TCS");
		System.out.println(":flag1:"+flag1);
		linkedHashSetObj.add(null);
		linkedHashSetObj.add(null);
		System.out.println(":linkedHashSetObj:"+linkedHashSetObj);
	}
}
