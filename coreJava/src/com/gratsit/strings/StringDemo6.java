package com.gratsit.strings;

public class StringDemo6 {

	public static void main(String[] args) {
		String s1=new String("Wipro Technologies");
		String s2=new String("Wipro Technologies");
		
		System.out.println(s1==s2); //false
		
		String s3="Wipro Technologies";
		System.out.println(s1==s3); //false
		
		String s4="Wipro Technologies";
		System.out.println(s1==s4); //false
		
		System.out.println(s3==s4); //true
		
		String s5="Wipro"+" Technologies"; //"Wipro Tecgnologies"
		System.out.println(s1==s5); //false
		
		System.out.println(s3==s5); //true
//		
		String s6="Wipro";
		String s7=s6+" Technologies";	
		System.out.println(s4==s7); //
		
		final String s8="Wipro";
		String s9=s8+" Technologies";	
		System.out.println(s4==s9);
	}

}
