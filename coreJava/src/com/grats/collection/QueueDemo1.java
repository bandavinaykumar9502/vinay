package com.grats.collection;

import java.util.LinkedList;

public class QueueDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llQueue=new LinkedList();
		System.out.println(llQueue.peek()); //null
//		System.out.println(llQueue.remove()); //NoSuchElementException
		llQueue.offer("Sachin@gmail.com");
		llQueue.offer("Kohli@gmail.com");
		llQueue.offer("Dhoni@gmail.com");
		llQueue.offer("RohitSharma@gmail.com");
		llQueue.offer("Ganguly@gmail.com");
		llQueue.offer("Dravid@gmail.com");
		System.out.println(llQueue);
		System.out.println(llQueue.peek());
		System.out.println(llQueue);
		while(!llQueue.isEmpty()) {
			System.out.println(":poll():"+llQueue.poll());
		}
		System.out.println(llQueue);
		System.out.println("empty:poll():"+llQueue.poll());
//		
		llQueue.offer("Sachin@gmail.com");
		llQueue.offer("Kohli@gmail.com");
		llQueue.offer("Dhoni@gmail.com");
		llQueue.offer("RohitSharma@gmail.com");
		llQueue.offer("Ganguly@gmail.com");
		llQueue.offer("Dravid@gmail.com");
		System.out.println(llQueue);
		System.out.println(":element:"+llQueue.element());
		while(!llQueue.isEmpty()) {
			System.out.println(":remove():"+llQueue.remove());
		}
		System.out.println(llQueue);
//		System.out.println("empty:remove():"+llQueue.remove());
//		System.out.println(":element:"+llQueue.element());
	}
}