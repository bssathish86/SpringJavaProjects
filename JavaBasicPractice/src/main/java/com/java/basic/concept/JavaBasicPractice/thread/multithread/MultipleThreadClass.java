package com.java.basic.concept.JavaBasicPractice.thread.multithread;

import com.java.basic.concept.JavaBasicPractice.thread.singlethread.MyThread;

public class MultipleThreadClass {

	public static void main(String[] args) throws InterruptedException {

		// new MyRunnableThread("One");
		// new MyRunnableThread("Two");
		// new MyRunnableThread("Three");

		MyThread thread1 = new MyThread("MyThread");
		thread1.start();
		thread1.join();
		MyThread thread2 = new MyThread("MyThread 2");
		thread2.start();
		thread2.join();
		MyThread thread3 = new MyThread("MyThread 3");
		thread3.start();
	}
}
