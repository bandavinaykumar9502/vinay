package com.gratsit.arrays;

public class ArraysDemo6 {

	public static void main(String[] args) {		
//		long size=5;
//		String[] phoneNos1=new String[size]; 	 // Can't define the array of size by long value
		
		byte size1=3;
		String[] companyArr=new String[size1];
		companyArr[0]="GratsIT";
		companyArr[1]="Wipro";
		companyArr[2]="Infosys";
		for(int i=0;i<companyArr.length;i++){
			System.out.println(":"+companyArr[i]);
		}
		
		System.out.println(":"+companyArr[3]);
	}

}
