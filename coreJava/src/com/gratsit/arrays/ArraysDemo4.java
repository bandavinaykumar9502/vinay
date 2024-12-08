package com.gratsit.arrays;

public class ArraysDemo4 {

	public static void main(String[] args) {		
//			double[] marks={55.50, 66.66,77,88,100}; // Quick array initialization
		
		double[] marks;
//		marks={55.50, 66.66,77,88,100};  //This way is not possible.	
		marks=new double[]{55.50, 66.66,77,88,100};
//		
		for(int i=0;i<marks.length;i++){
			System.out.println(":"+marks[i]);
		}
	}

}
