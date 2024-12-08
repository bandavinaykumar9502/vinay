package com.gratsit.stringbuffer;

public class SBDemo1 {

	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("1234567890123456");
//		System.out.println(sb1.length());
//		System.out.println(sb1.capacity());
		
		sb1.append("7"); //(currentCapacity + 1)*2 ==> (16+1)*2 ==> 34
		
		System.out.println(":length:"+sb1.length());
		System.out.println(":capacity:"+sb1.capacity());
		sb1.append("1234567890123456");
		sb1.append("23");
		System.out.println(":length:"+sb1.length());
		System.out.println(":capacity:"+sb1.capacity());
		//(34+1) * 2

	}

}
