package com.grats.exception;

public class RuntimeErrorDemo2 {
	public static boolean isLeapYear(int year) {
		return year%4==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":Is 2024 Leap year:"+isLeapYear(2024));
		System.out.println(":Is 1700  Leap year:"+isLeapYear(1700));
	}
}
