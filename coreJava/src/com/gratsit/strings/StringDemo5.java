package com.gratsit.strings;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="GratsIT"; 
		String s2 = s1.concat("");
		System.out.println(s1==s2);
		
		String s3=new String("Infosys"); 
		String s4 = s3.concat("");
		System.out.println(s3==s4);
	}

}
