package com.grats.am.variables;

public class Employee {

	public int id=1001;
	protected String name="Sachin";
	String profession="Cricket";
	private String city="Mumbai";
	
	public void updateEmployee() {
		System.out.println(":id:"+id);
		System.out.println(":name:"+name);
		System.out.println(":profession:"+profession);
		System.out.println(":city:"+city);
		id=1002;
		name="Sehwag";
		profession="Cricket";
		city="Delhi";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.updateEmployee();
		System.out.println("=======================");
		System.out.println(":id:"+emp.id);
		System.out.println(":name:"+emp.name);
		System.out.println(":profession:"+emp.profession);
		System.out.println(":city:"+emp.city);
	}

}
