package com.grats.object;

class Employee{
	public String name;
	public int empId;
	public String dept;
	public Employee(String name, int empId, String dept) {
		super();
		this.name = name;
		this.empId = empId;
		this.dept = dept;
	}
	public Employee() {
		
	}
}
public class ToStringDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ramesh",1001,"Sales");
		Employee emp2=new Employee("Rajesh",1002,"Accounts");
		System.out.println(":emp1:"+emp1);
		System.out.println(":emp2:"+emp2);
		System.out.println(":emp1.toString():"+emp1.toString());
		System.out.println(":emp2.toString():"+emp2.toString());
	}
}	
