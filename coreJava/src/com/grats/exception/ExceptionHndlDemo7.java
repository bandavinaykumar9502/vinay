package com.grats.exception;

public class ExceptionHndlDemo7 {
	public static void main(String[] args) {
		int a=100;
		int[] arr= {3,2,23,434};
		try {
			int b=a/0;
			int c=arr[3];
			Class.forName("com.grats.st.variable.Company");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("===>Exception");
		}
	}
}