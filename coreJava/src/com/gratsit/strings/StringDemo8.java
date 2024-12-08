package com.gratsit.strings;

import java.util.Scanner;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="   ABCDEF   ";
//		System.out.println(s);
//		System.out.println(s.toLowerCase());
//		if("ABCDEF".equals(s.trim())) {
//			System.out.println(":true:");
//		}else {
//			System.out.println(":false:");
//		}
			
		Scanner sc = new Scanner(System.in);
		System.out.println(":Please Enter your city:");
		String city = sc.nextLine().toLowerCase().trim();
		String message;
		switch (city) {
			case "hyderabad":
				message = "Hyderabad is famous for biriyani";
				break;
			case "bangalore":
				message = "Bangalore is famous for malls";
				break;
			case "chennai":
				message = "Chennai is famous for beaches";
				break;
			default:
				message = "Please enter valid city";
				break;
		}
		System.out.println(message);
	}

}
