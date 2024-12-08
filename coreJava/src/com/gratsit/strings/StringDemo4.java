package com.gratsit.strings;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="GratsIT"; 
		System.out.println(":Before concat:s1:"+s1);//GratsIT
		s1.concat("Solutions");
		System.out.println(":After concat::s1:"+s1);
		String s2=s1.concat("Software");
		System.out.println(":s1:"+s1);//
		System.out.println(":s2:"+s2);//
		System.out.println(s1==s2);
	}

}
