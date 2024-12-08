package com.gratsit.stringbuffer;

public class SBDemo3 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("GratsIT");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("1234567890123456");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("7");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
