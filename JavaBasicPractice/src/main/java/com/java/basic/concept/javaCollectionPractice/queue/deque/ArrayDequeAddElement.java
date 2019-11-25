package com.java.basic.concept.javaCollectionPractice.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAddElement {

	public static void main(String[] args) {
		// Unlike Queue, we can add or remove elements from both sides.
		// Null elements are not allowed in the ArrayDeque.
		// ArrayDeque is not thread safe, in the absence of external synchronization.
		// ArrayDeque has no capacity restrictions.
		// ArrayDeque is faster than LinkedList and Stack.

		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");

		System.out.println("After offerFirst Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

		// deque.poll();
		// deque.pollFirst();//it is same as poll()
		deque.pollLast();

		System.out.println("After pollLast() Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}
	}
}
