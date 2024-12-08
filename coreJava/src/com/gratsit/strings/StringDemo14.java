package com.gratsit.strings;

public class StringDemo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = new String("hello");
        String str2 = "hello";
     
        // Using intern() to get the reference to the string from the pool
        String str3 = str2.intern();
        
        // Comparing references

        System.out.println(str1 == str2); 
        System.out.println(str2 == str3);
	}

}
