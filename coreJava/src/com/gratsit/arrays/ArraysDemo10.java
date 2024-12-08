package com.gratsit.arrays;

public class ArraysDemo10 {

	public static void main(String[] args) {		
		int[] arr1= {5,6,9,4};
		int[] arr2=arr1; // Shollow copy
		
		System.out.print(":arr1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.print("\n:arr2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		System.out.println("\n==============================");
		arr2[2]=14;
		System.out.print(":arr1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n:arr2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
