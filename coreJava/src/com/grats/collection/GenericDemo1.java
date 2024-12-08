package com.grats.collection;

class A<T> {
	private T value;

	public A(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
public class GenericDemo1{
	public static void main(String[] args) {
		//In this example, A is a generic class with a type parameter T. 
//		This allows you to create a A object that can hold values of any type. For example

		A<Integer> intA = new A<>(10);
		A<String> stringA = new A<>("Hello");
		int intValue = intA.getValue(); // No need for casting
		String stringValue = stringA.getValue(); // No need for casting
		System.out.println(":intValue:"+intValue);
		System.out.println(":stringValue:"+stringValue);
		
//		A<int> a2=new A<>(20); //Only instance types are allowed primitives are not allowed.
	}
}
