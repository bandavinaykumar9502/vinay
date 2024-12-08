package com.grats.markerinterface;

import com.grats.files.FileOperations;

public class SerializationTest {

	public static void main(String[] args) {
		System.out.println(":Start:");
		Employee emp = new Employee(1001, "ABC", "Bangalore","560017");
		Employee emp2 = new Employee(1002, "XYZ", "Bangalore","560018");
		
		FileOperations obj = new FileOperations();
		obj.createFolder();
		obj.writeObject(emp,emp2);
		System.out.println(":End:");

	}

}
