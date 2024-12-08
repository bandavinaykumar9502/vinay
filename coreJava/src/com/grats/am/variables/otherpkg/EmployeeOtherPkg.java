package com.grats.am.variables.otherpkg;

import com.grats.am.variables.Employee;

public class EmployeeOtherPkg {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(":id:"+emp.id);
//		System.out.println(":name:"+emp.name);
//		System.out.println(":profession:"+emp.profession);
//		System.out.println(":city:"+emp.city);
		emp.id=1002;
//		emp.name="Sehwag";
//		emp.profession="Cricket";
//		emp.city="Delhi";
		System.out.println(":id:"+emp.id);
	}

}
