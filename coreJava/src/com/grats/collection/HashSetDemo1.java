package com.grats.collection;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet hashSetObj=new HashSet();
		hashSetObj.add("Grates IT Services");
		hashSetObj.add("HCL");
		hashSetObj.add(14);
		hashSetObj.add("Infosys");
		hashSetObj.add(14);
		hashSetObj.add("Wipro");
		System.out.println(":hashSetObj:"+hashSetObj);
		boolean flag=hashSetObj.add("Infosys");
		System.out.println(":flag:"+flag);
		boolean flag1=hashSetObj.add("TCS");
		System.out.println(":flag1:"+flag1);
		hashSetObj.add(null);
		hashSetObj.add(null);
		System.out.println(":hashSetObj:"+hashSetObj);
	}
}