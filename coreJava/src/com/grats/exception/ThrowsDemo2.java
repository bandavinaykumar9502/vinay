package com.grats.exception;

import java.io.PrintWriter;

public class ThrowsDemo2 {
	public void printMsg() throws Exception {
		System.out.println("Inside printMsg():");
		Class.forName("com.grats.st.variable.Company");
		PrintWriter pw = new PrintWriter("abc.txt"); // FileNotFoundException
		pw.write("Hello");
		pw.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(":main:start:");
		ThrowsDemo1 obj = new ThrowsDemo1();
		obj.printMsg();
		System.out.println(":main:end:");
	}
}	
