package com.grats.exception;

import java.io.PrintWriter;

public class CheckedExceptionDemo2{
	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter("abc.txt"); //FileNotFoundException
		pw.write("Hello");
		pw.close();
	}				
}
