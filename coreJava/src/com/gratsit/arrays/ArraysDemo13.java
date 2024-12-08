package com.gratsit.arrays;

public class ArraysDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mArr=new int[3][3];
		
		mArr[0][0]=1;
		mArr[0][1]=2;
		mArr[0][2]=3;
		
		mArr[1][0]=4;
		mArr[1][1]=5;
		mArr[1][2]=6;
		
		mArr[2][0]=7;
		mArr[2][1]=8;
		mArr[2][2]=9;
		
		for(int i=0;i<mArr.length;i++) {
			for(int j=0;j<mArr[i].length;j++) {
				System.out.print("\t"+mArr[i][j]);
			}
			System.out.println();
		}
	}

}
