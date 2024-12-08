package com.gratsit.strings;

class StringDemo9{
	public static void main(String[] args){
		String fruits = "apple,orange,banana,graps";
		String[] fruitsArr = fruits.split(",");
		for(String fruit:fruitsArr) {
			System.out.println(fruit);
		}
		System.out.println("=============================");
		String[] messageArr = "Hi Hello World".split(" ");
		for(String str:messageArr) {
			System.out.println(str);
		}
	}		
}
