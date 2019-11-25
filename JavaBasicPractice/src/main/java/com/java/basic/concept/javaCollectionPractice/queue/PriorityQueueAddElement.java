package com.java.basic.concept.javaCollectionPractice.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAddElement {

	// Java Queue interface orders the element in FIFO(First In First Out) manner.
	// In FIFO, first element is removed first and last element is removed at last.

	public static void main(String args[]) {

		Queue<String> queue = new PriorityQueue<String>();

		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		// Exception in thread "main" java.lang.NullPointerException
		// queue.add(null);

		System.out.println("queue data :" + queue.add("1"));
		System.out.println("queue data :" + queue.offer("2"));

		System.out.println("queue data :" + queue);
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");

		Iterator<String> itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");

		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
