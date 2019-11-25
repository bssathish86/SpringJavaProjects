package com.java.basic.concept.JavaBasicPractice.thread.singlethread;

public class SingleThreadClass {

	public static void main(String[] args) throws InterruptedException {

		MyThread thread = new MyThread("MyThread");
		// thread.run();
		// thread.run();
		thread.start();
		// new MyRunnableThread("One");

		// Exception in thread "main" java.lang.IllegalThreadStateException
		// thread.start();

		System.out.println("Current Thread : " + Thread.currentThread());
		System.out.println("Thread Name : " + thread.getName());
		System.out.println("Thread Priority : " + thread.getPriority());
		System.out.println(thread.getName() + " State :" + thread.getState());
		System.out.println("Thread ThreadGroup : " + thread.getThreadGroup());

		Thread.sleep(1000);
		System.out.println(thread.getName() + " State :" + thread.getState());

		thread.interrupt();
		// thread.wait(1000);
		// System.out.println(thread.getName() + " State :" + thread.getState());

		if (thread.isInterrupted())
			System.out.println(thread.getName() + " interrupted : " + thread.isInterrupted());

		System.out.println(thread.getName() + " ActiveCount () : " + MyThread.activeCount());

		if (thread.isAlive())
			System.out.println(thread.getName() + " isAlive : " + thread.isAlive());

		// Main thread is waiting to complete running thread
		thread.join();

		// MyThread.sleep(2000);
		System.out.println(thread.getName() + " Completed .");
	}
}
