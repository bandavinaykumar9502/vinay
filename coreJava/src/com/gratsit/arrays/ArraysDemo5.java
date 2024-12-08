package com.gratsit.arrays;

public class ArraysDemo5 {

	public static void main(String[] args) {		
		short marksArr[]=new short[5];
		
//		for(int i=0;i<marksArr.length;i++){
//			System.out.println(":"+marksArr[i]);//0
//		}
		marksArr[0]=11;
		marksArr[1]=22;
		marksArr[2]=33;
		marksArr[3]=44;
		for(int i=0;i<marksArr.length;i++){
			System.out.println(":"+marksArr[i]);
		}
	}

}
