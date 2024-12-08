package com.grats.object;

public class HashCodeDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ramesh",1001,"Sales");
		Employee emp2=new Employee("Ramesh",1001,"Sales");
		System.out.println(":1:"+emp1.hashCode());
		System.out.println(":2:"+emp2.hashCode());
		
		String str1=new String("Grats");
		String str2=new String("Grats");
		System.out.println(":3:"+str1.hashCode());
		System.out.println(":4:"+str2.hashCode());
	}
}