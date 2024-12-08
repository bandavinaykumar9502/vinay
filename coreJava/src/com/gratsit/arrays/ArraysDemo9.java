package com.gratsit.arrays;

public class ArraysDemo9 {

	public static void main(String[] args) {		
//		int[] a = new int[4];
//		a.length = 10;         // error
		
		int[] a1 = {42, -7, 1, 15};
		int[] a2 = {42, -7, 1, 15};
		System.out.println(":a1:"+a1);
		System.out.println(":a2:"+a2);
		if (a1 == a2) {  
			System.out.println(":Equals:"); 
		} else {
			System.out.println("Not Equals");
		} 
//		
		if (a1.equals(a2)){  
			System.out.println(":Equals:"); 
		} else {
			System.out.println("Not Equals");
		}   
//		
//		System.out.println(a1);   
//		System.out.println(a2); 
	}

}
