package com.grats.object;

import java.lang.reflect.*;

public class GetClassDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ramesh",1001,"Sales");
		System.out.println(emp1.getClass());
		Class cls=emp1.getClass();
		System.out.println(":cls:"+cls);
		System.out.println(":cls.getConstructors():"+cls.getConstructors());
		for(Constructor constr:cls.getConstructors()) {
			System.out.println(":constr:"+constr);
		}
		System.out.println(":cls.getFields():"+cls.getFields());
		for(Field fd:cls.getFields()) {
			System.out.println(":fd:"+fd);
		}
	}
}
