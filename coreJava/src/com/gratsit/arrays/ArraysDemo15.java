package com.gratsit.arrays;

import java.util.Arrays;

public class ArraysDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 55,10, 20, 15, 22,0, 35,-23,-34 };
		System.out.println(":intArr:"+intArr);
		
		System.out.println(":intArr:"+Arrays.toString(intArr));
//		
		Arrays.sort(intArr);
		System.out.println(":intArr:"+Arrays.toString(intArr));
	}

}
