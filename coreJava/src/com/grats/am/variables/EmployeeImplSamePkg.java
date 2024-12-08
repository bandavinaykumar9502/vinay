package com.grats.am.variables;

public class EmployeeImplSamePkg extends Employee {

	public void displayEmployee() {
		System.out.println(":id:"+id);
		System.out.println(":name:"+name);
		System.out.println(":profession:"+profession);
//		System.out.println(":city:"+city);
		id=1002;
		name="Sehwag";
		profession="Cricket";
//		city="Delhi";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImplSamePkg emp=new EmployeeImplSamePkg();
		emp.displayEmployee();
		System.out.println(":=========================:");
		System.out.println(":id:"+emp.id);
		System.out.println(":name:"+emp.name);
		System.out.println(":profession:"+emp.profession);
//		System.out.println(":city:"+emp.city);
	}

}
