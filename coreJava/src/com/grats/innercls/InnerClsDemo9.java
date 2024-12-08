package com.grats.innercls;

abstract class Person {
	int personId=1001;
	String personName="XYZ";
	public abstract void printPersonDetl();
	public void showDetl() {
		System.out.println(":showDetl():");
	}
}

public class InnerClsDemo9 {
	public static void main(String[] args) {
		Person std=new Person(){
			public void printPersonDetl(){
				System.out.println(personId+":"+personName);
			}
		};
		std.printPersonDetl();
		std.showDetl();
		
//		Person person=new Person();
	}
}
