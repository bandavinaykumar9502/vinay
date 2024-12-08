package com.gratsit.saticc;

class Employee{
	int id;
	String name;
	static String company;
		
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void printEmployeeDetl(){
		System.out.println(id+" "+name+" "+company);
	}
	
	static public void printEmployeeDetl1(Employee emp){
		System.out.println(emp.id+" "+emp.name+" "+company);
	}
	static {
		company="GratsIT";
		System.out.println(":1.Static block executed:");
	}
	static {
		company="Infosys";
		System.out.println(":2.Static block executed:");
	}
}

public class StaticMethodDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1001, "Rajesh");
		Employee.company="GratsIT";
//		emp1.printEmployeeDetl();
		Employee.printEmployeeDetl1(emp1);
		Employee emp2=new Employee(1002, "Ramesh");
		Employee emp3=new Employee(1003, "Dinesh");
		Employee.company="Infosys";
		Employee emp4=new Employee(1004, "Hampi");
		System.out.println("========================================");
//		emp1.printEmployeeDetl();
//		emp2.printEmployeeDetl();
//		emp3.printEmployeeDetl();
//		emp4.printEmployeeDetl();
		Employee.printEmployeeDetl1(emp1);
		Employee.printEmployeeDetl1(emp2);
		Employee.printEmployeeDetl1(emp3);
		Employee.printEmployeeDetl1(emp4);
	}
}	
