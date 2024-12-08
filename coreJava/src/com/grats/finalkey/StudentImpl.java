package com.grats.finalkey;

final class Student{
	
}

class StudentImpl extends Student{ // This is not possible will get the compilation error because final classes can't extend
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student emp=new StudentImpl();
		System.out.println(":emp:"+emp);
	}				
}