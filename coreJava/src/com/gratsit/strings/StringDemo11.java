package com.gratsit.strings;

public class StringDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String();//Creates empty String object.
		System.out.println(":"+s1);
		StringBuffer sb=new StringBuffer("Java");
		String s3=new String(sb);
		System.out.println(":s3:"+s3);
		StringBuilder s4=new StringBuilder("Tech");
		String s5=new String(s4);
		System.out.println(":s5:"+s5);
		
		
		String s6=new String(new char[]{'G','R','A','T','S'});
		System.out.println(":s6:"+s6);
		
		String s7=new String(new byte[]{65,66,67,68,69});
		System.out.println(":s7:"+s7);
	}

}
