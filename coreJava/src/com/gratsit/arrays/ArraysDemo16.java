package com.gratsit.arrays;

import java.util.Arrays;

public class ArraysDemo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 55,10, 20, 15, 22,0, 35,-23,-34 };
		
		int eleIndex = Arrays.binarySearch(intArr, 22);
		System.out.println(":Given element index:"+eleIndex);
	}
	
	

}
