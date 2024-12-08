package com.grats.finalkey;

class Employee {
	String name="Prakash";
	int empId=1001;

	public final void printName() {
		System.out.println(":Employee:name:"+name);
	}
	
	public void printEmpId(){
		System.out.println(":Employee:empId:"+empId);
	}
}

public class EmployeeImpl extends Employee {
//	public void printName() { // Cannot override the final method from Employee
//		System.out.println(":EmployeeImpl:printName:"+name);
//	}
	public void printEmpId(){
		System.out.println(":EmployeeImpl:printEmpId:"+empId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new EmployeeImpl();
		emp.printName();//
		emp.printEmpId();//
	}
}
