package com.grats.object;

class Student{
	int stdId;
	String name;
	String college;
	public Student(int stdId, String name, String college) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", college=" + college + "]";
	}
	
}
public class ToStringDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student(2001,"Hampi","KMM");
		Student std2=new Student(2002,"Naga","SVArts");
		System.out.println(":std1:"+std1);
		System.out.println(":std2:"+std2);
	}
}

