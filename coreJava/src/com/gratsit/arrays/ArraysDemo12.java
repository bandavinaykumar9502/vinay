package com.gratsit.arrays;

public class ArraysDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mArr={{2,3,4},{4,5,6},{7,3,7}};
		mArr[1][1]=34;
		for(int i=0;i<mArr.length;i++) { //i=1
			for(int j=0;j<mArr[i].length;j++) { //3
				System.out.print("\t"+mArr[i][j]); //i=0,j=1
				//2 3  4
			}
			System.out.println();
		}
		
		
		
	}

}
