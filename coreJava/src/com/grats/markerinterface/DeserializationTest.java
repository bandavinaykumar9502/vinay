package com.grats.markerinterface;

import com.grats.files.FileOperations;

public class DeserializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":Start:");
		FileOperations obj = new FileOperations();
		for(Employee emp:obj.readObject()) {
			System.out.println(":emp:"+emp);
		}
		System.out.println(":End:");
	}

}
