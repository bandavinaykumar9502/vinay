package com.grats.collection;

public class GenericDemo2 {
	// A Generic method example
	 <X> void genericDisplay(X element){
		System.out.println(element.getClass().getName()
						   + " = " + element);
	}
	public static void main(String[] args)
	{
		GenericDemo2 obj=new GenericDemo2();
		obj.genericDisplay(11);
		obj.genericDisplay("GratsIT");
		obj.genericDisplay(1.0);
	}
}
