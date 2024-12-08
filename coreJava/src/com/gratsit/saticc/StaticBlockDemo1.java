package com.gratsit.saticc;

public class StaticBlockDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1001,"Rakesh");
		Employee e2=new Employee(1002,"Ramesh");
		Employee e3=new Employee(1002,"Ramesh");
		Employee e4=new Employee(1002,"Ramesh");
//		Employee.company="Infosys";
		e1.printEmployeeDetl();
		e2.printEmployeeDetl();
		e3.printEmployeeDetl();
		e4.printEmployeeDetl();
	}

}
