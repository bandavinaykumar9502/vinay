package com.grats.innercls;

class University {
	 String address="Bangalore";
	 String name="ABC";
	 private class Department{
		int deptId=1001;
		String deptName="Sales";
		void printDetl() {
			System.out.println(":name:"+name+":address:"+address+":deptId:"+deptId+":deptName:"+deptName);
		}
	}
	public void method1() {
		Department dept = new Department();
		dept.printDetl();
	}
}

public class InnerClsDemo5{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University obj=new University();
//		University.Department dept=obj.new Department(); //This is not possible because Departmet is a private class
		obj.method1();
	}
}
