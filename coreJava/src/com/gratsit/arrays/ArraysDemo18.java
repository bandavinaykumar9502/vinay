package com.gratsit.arrays;

import java.util.Arrays;

public class ArraysDemo18 {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		System.out.println(Arrays.toString(intArr));
		
		int[] intArr3=Arrays.copyOf(intArr,3); //no of elements has to copy.
		System.out.println(Arrays.toString(intArr3));
		
		int[] intArr4=Arrays.copyOfRange(intArr, 2, 4);
		System.out.println(Arrays.toString(intArr4));
		

	}

}
