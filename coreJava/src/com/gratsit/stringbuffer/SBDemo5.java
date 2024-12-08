package com.gratsit.stringbuffer;

public class SBDemo5 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("GratsIT");
		System.out.println(sb1.length()); //7
		System.out.println(sb1.capacity());//23
		
		StringBuffer sb2=new StringBuffer("GratsIT");
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false.

	}

}
