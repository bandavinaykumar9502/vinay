package com.grats.innercls;

interface Employee{
	public abstract void showEmployee();
}

public class InnerClsDemo7 {
	public static void main(String[] args) {
		Employee emp=new Employee(){
			public void showEmployee(){
				System.out.println("showEmployee()");
			}
		};
		emp.showEmployee();
	}
}
