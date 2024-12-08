package com.grats.am.variables;

public class EmployeeSamePkg {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=1002;
		emp.name="Sehwag";
		emp.profession="Cricket";
//		emp.city="Delhi";
		System.out.println(":id:"+emp.id);
		System.out.println(":name:"+emp.name);
		System.out.println(":profession:"+emp.profession);
//		System.out.println(":city:"+emp.city);
	}

}
