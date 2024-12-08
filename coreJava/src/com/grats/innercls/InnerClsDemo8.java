package com.grats.innercls;

class Student {
	int stdId=1001;
	String stdName="XYZ";
	public void printStudent() {
		System.out.println(stdId+":"+stdName);
	}
	
}

public class InnerClsDemo8 {
	public static void main(String[] args) {
		Student std=new Student(){
			public void printStudent(){
				System.out.println("printStudent()");
			}
		};
		std.printStudent();
		System.out.println(""+std.stdId);
		System.out.println(""+std.stdName);
//		Student std1=new Student();
//		std1.printStudent();
	}
}
