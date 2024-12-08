package com.grats.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsDemo1 {
	public void printMsg() throws ClassNotFoundException,FileNotFoundException {
		System.out.println("Inside printMsg():");
//		try { // instead of try catch can throws the exception but called should handle it.
			Class.forName("com.grats.st.variable.Company");
			PrintWriter pw = new PrintWriter("abc.txt"); // FileNotFoundException
			pw.write("Hello");
			pw.close();
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch(FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":main:start:");
		ThrowsDemo1 obj = new ThrowsDemo1();
		try {
			obj.printMsg();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(":main:end:");
	}
}
