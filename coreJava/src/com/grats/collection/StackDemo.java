package com.grats.collection;

import java.util.Stack;

class StackDemo{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Z");
		s.push("A");
		s.push("X");
		s.push("P");
		System.out.println(":s:"+s);
		System.out.println(":s:"+s.search("V"));//-1
		System.out.println(":s:"+s.search("Z"));//4
		System.out.println(":s:"+s.search("A"));//3
		System.out.println(":s:"+s.search("X"));//2
		System.out.println(":s:"+s.search("P"));//1
		System.out.println(":empty:"+s.empty());
		System.out.println(":peek:"+s.peek());
		System.out.println(":s:"+s);
		System.out.println(":pop:"+s.pop());
		System.out.println(":s:"+s);
		System.out.println(":pop:"+s.pop());
		System.out.println(":s:"+s);
		System.out.println(":pop:"+s.pop());
		System.out.println(":s:"+s);
		System.out.println(":pop:"+s.pop());
		System.out.println(":s:"+s);
		
//		System.out.println(":pop:"+s.pop()); //java.util.EmptyStackException
		System.out.println(":peek:"+s.peek()); //java.util.EmptyStackException
	}				
}
