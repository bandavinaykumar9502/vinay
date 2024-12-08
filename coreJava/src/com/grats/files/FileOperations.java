package com.grats.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.grats.markerinterface.Employee;

public class FileOperations {
	private static final String FILE_PATH="files/accounts";
	
	public void createFolder() {
		File file = new File(FILE_PATH);
		if(!file.exists()) {
			file.mkdirs();
		}
		System.out.println("directories are created");
	}
	
	public void deleteFolder() {
		File file = new File(FILE_PATH);
		file.delete();
	}
	
	public void writeObject(Employee... empArgs) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream(FILE_PATH+"/"+"employee_master.obj",true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(empArgs);
			System.out.println("Object written to file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public Employee[] readObject() {
		FileInputStream fis;
		ObjectInputStream ois;
		Object obj;
		Employee[] employees = null;
		try {
			fis = new FileInputStream(FILE_PATH + "/" + "employee_master.obj");
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
			employees = (Employee[]) obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
}
