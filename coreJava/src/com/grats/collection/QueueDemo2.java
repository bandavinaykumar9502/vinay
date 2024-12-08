package com.grats.collection;

import java.util.PriorityQueue;

public class QueueDemo2 {
	public static void main(String[] args) {
		PriorityQueue ppQueue=new PriorityQueue();
		System.out.println(ppQueue.peek()); //null
//		System.out.println(ppQueue.remove()); //NoSuchElementException
		ppQueue.offer("Sachin@gmail.com");
		ppQueue.offer("Kohli@gmail.com");
		ppQueue.offer("Dhoni@gmail.com");
		ppQueue.offer("RohitSharma@gmail.com");
		ppQueue.offer("Ganguly@gmail.com");
		ppQueue.offer("Dravid@gmail.com");
		System.out.println(ppQueue);
		System.out.println(ppQueue.peek());
		System.out.println(ppQueue);
		while(!ppQueue.isEmpty()) {
			System.out.println(":poll():"+ppQueue.poll());
		}
		System.out.println(ppQueue);
		System.out.println("empty:poll():"+ppQueue.poll());
		ppQueue.offer("Sachin@gmail.com");
		ppQueue.offer("Kohli@gmail.com");
		ppQueue.offer("Dhoni@gmail.com");
		ppQueue.offer("RohitSharma@gmail.com");
		ppQueue.offer("Ganguly@gmail.com");
		ppQueue.offer("Dravid@gmail.com");
		System.out.println(ppQueue);
		System.out.println(":element:"+ppQueue.element());
		while(!ppQueue.isEmpty()) {
			System.out.println(":remove():"+ppQueue.remove());
		}
		System.out.println(ppQueue);
//		System.out.println("empty:remove():"+ppQueue.remove());
//		System.out.println(":element:"+ppQueue.element());
	}
}
