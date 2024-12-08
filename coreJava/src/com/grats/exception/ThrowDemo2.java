package com.grats.exception;

public class ThrowDemo2 {
	
	public void loadClass(String clsName)throws ClassNotFoundException{
		try{
			Class.forName(clsName);
		}catch(ClassNotFoundException ex){
			throw new ClassNotFoundException("Please class check your class name which is not available to load");
		}
	}

	public static void main(String[] args)throws ClassNotFoundException{
		ThrowDemo2 obj = new ThrowDemo2();
		obj.loadClass("com.grats.st.variable.Company");
	}
}					
