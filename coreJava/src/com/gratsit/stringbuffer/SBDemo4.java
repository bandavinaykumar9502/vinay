package com.gratsit.stringbuffer;

public class SBDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("GratsIT");
		System.out.println(sb.charAt(1));
//		System.out.println(sb.charAt(10));
		sb.setCharAt(1,'Y');
		System.out.println(sb);
		
		sb.append(" Solutions");
		System.out.println(sb);
//		sb.a
	}

}
