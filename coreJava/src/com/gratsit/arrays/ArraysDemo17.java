package com.gratsit.arrays;

import java.util.Arrays;

public class ArraysDemo17 {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		int intArr1[] = { 10, 20, 15, 22,36  }; 
		
		if(intArr==intArr1) {
			System.out.println(":true:");
		}else{
			System.out.println(":false:");
		}
  
		System.out.println(":is both arrays elements same: "
						   + Arrays.equals(intArr, intArr1)); 

	}

}
