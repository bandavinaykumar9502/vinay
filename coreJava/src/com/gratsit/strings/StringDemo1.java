package com.gratsit.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Grats"); 	// In this case creates object in Heap memory.
		String s2=new String("Grats");	// In this case creates object in Heap memory.
		
		System.out.println(":s1:"+s1); //Grats
		System.out.println(":s2:"+s2); //Grats
		
		System.out.println(s1==s2);//false
		
	}

}
