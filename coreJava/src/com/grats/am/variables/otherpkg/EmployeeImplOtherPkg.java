package com.grats.am.variables.otherpkg;

import com.grats.am.variables.Employee;

public class EmployeeImplOtherPkg extends Employee{

	public void displayEmployee() {
		System.out.println(":id:"+id+":name:"+name);
//		System.out.println(":profession:"+profession+":city:"+city);
		id=1002;
		name="Shehwag";
//		profession="Cricket";
//		city="Delhi";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImplOtherPkg emp=new EmployeeImplOtherPkg();
		emp.displayEmployee();
		System.out.println(":=========================:");
		System.out.println(":id:"+emp.id+":name:"+emp.name);
//		System.out.println(":profession:"+emp.profession+":city:"+emp.city);		
	}

}
