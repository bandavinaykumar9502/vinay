package com.arrays;

import java.util.Scanner;

public class SwapingTwoArrays {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = s.nextInt();
		System.out.println("Enter the elements of Array:");
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i=i+2) {
			int temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			System.out.print(a[i]+" "+a[i+1]+" ");
			s.close();
		
		}
		
	}
}
