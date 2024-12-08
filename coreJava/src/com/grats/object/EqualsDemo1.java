package com.grats.object;

public class EqualsDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ramesh",1001,"Sales");
		Employee emp2=new Employee("Ramesh",1001,"Sales");
		System.out.println(":1:"+emp1.equals(emp2));
		
//		Employee emp3=emp2;
//		System.out.println(":2:"+emp3.equals(emp2));
	}
}
