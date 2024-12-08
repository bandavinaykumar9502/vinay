package com.gratsit.saticc;

class Student {
	int id;
	String name;
	static String college;

//	 Student(int id,String name,String college){
//		 this.id=id;
//		 this.name=name;
//		 this.college=college;
//	 }
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class StaticVarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1001, "Rajesh");
//		std1.college="Narayana";
		Student.college = "Narayana";
		System.out.println(std1.id + " " + std1.name + " " + std1.college);
		Student std2 = new Student(1002, "Ramesh");
		Student std3 = new Student(1003, "Dinesh");
//		std3.college = "Chaitanya";
		Student.college = "Chaitanya";
		Student std4 = new Student(1004, "Hampi");
		System.out.println("========================================");
		System.out.println(std1.id + " " + std1.name + " " + std1.college);
		System.out.println(std2.id + " " + std2.name + " " + std2.college);
		System.out.println(std3.id + " " + std3.name + " " + std3.college);
		System.out.println(std4.id + " " + std4.name + " " + std4.college);
	}
}