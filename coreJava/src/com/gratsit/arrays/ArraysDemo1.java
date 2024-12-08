package com.gratsit.arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int[] marks={55,65,75,85};
		
		System.out.println(marks[0]); //55
		System.out.println(marks[1]); //65
		System.out.println(marks[2]); //75
		System.out.println(marks[3]); //85
		
		marks[2]=77;
		marks[3]=99;
		System.out.println(":Array updated:");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);		
	}

}
