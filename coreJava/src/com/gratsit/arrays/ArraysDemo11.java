package com.gratsit.arrays;

public class ArraysDemo11 {

	public static void main(String[] args) {		
		char[] arr1= {'H','E','L','L','O'};
		
		char[] arr2=arr1.clone();
		
		// Deep copy
		System.out.print(":arr1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n:arr2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n==============================");
		arr1[2]='A';
		arr1[3]='B';
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
