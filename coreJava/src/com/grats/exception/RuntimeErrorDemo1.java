package com.grats.exception;

public class RuntimeErrorDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=5;
		System.out.println(":i:"+i+":j:"+j);
		if(j!=0) {
			int d=i/j;//10/0
			System.out.println(":d:"+d);
		}
	}
}	
