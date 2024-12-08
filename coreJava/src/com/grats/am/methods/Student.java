package com.grats.am.methods;

public class Student {

	public void printRollNo() {
		int rollNo=2001;
		System.out.println(":rollNo:"+rollNo);
	}
	
	protected void printName() {
		String name="Prakash";
		System.out.println(":name:"+name);
	}
	
	void printSubject() {
		String subject="Mathematics";
		System.out.println(":subject:"+subject);
	}
	
	private void printMarks() {
		int marks=80;
		System.out.println(":marks:"+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.printRollNo();
		std.printName();
		std.printSubject();
		std.printMarks();
	}

}
