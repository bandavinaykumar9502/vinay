package com.gratsit.arrays;

public class ArraysDemo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double []marks[];
//		Double[][] marks=new Double[5][6];
		marks=new Double[5][6];
		marks[0]=new Double[] {60.0, 77.0, 65.0, 58.0, 60.0, 90.0};
		marks[1]=new Double[] {75.0, 98.0, 78.0, 90.0, 56.0, 66.0};
		marks[2]=new Double[] {98.0, 96.0, 65.0, 54.0, 56.0, 87.0};
		marks[3]=new Double[] {75.0, 98.0, 78.0, 90.0, 56.0, 66.0};
		marks[4]=new Double[] {75.0, 98.0, 78.0, 90.0, 56.0, 66.0};
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print("\t"+marks[i][j]);
			}
			System.out.println();
		}
	}

}
