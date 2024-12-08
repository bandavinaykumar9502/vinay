package com.grats.object;

class Employee1{
	public String name;
}
class Student1 implements Cloneable {
	private int id;
	public String name;
	private String address;
	public Employee1 emp1;
	
	public Student1() {
	}
	public Student1(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneDemo2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student1 std1=new Student1(1001,"Prakash P","Bangalore");
		Student1 std2=std1; //Shallow copy, here 2 references are pointing to same object
		System.out.println(":std1==std2:"+(std1==std2));
		System.out.println("std1:"+std1);
		System.out.println("std1:"+std2);
		
		
		std2.setName("Rakesh"); 
		System.out.println("std1:"+std1);
		System.out.println("std2:"+std2);
		
		std1.emp1=new Employee1();
		Student1 std4 = (Student1)std1.clone();  //Here created a new duplicate object, Deep copy
		System.out.println(":std1==std4:"+(std1==std4));
		System.out.println("std1:"+std1);
		System.out.println("std4:"+std4);
		System.out.println("=============================");
		std4.setName("Rajesh");
		System.out.println("std1:"+std1);
		System.out.println("std4:"+std4);
		
		System.out.println(std1.emp1==std4.emp1); //Internal references are shallow copied
		System.out.println(std1.emp1.name);
		System.out.println(std4.emp1.name);
		std1.emp1.name="Hi";
		System.out.println(std1.emp1.name);
		System.out.println(std4.emp1.name);
	}
}