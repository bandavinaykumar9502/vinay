package com.grats.exception;

public class FinallyDemo4 {
	public static void main(String[] args) {
		int[] arr= {3,2,23,434};
		try {
			System.out.println(":try:");
			int c=arr[3];
			if(c%2==0){
				System.out.println(c+" is Even");
				return;
			}else{
				System.out.println(c+" Odd");
			}
		}catch(Exception ex) {
			System.out.println(":catch:");
		}
		finally{
			System.out.println(":finally:");
		}	
		System.out.println(":End:");
	}
}
