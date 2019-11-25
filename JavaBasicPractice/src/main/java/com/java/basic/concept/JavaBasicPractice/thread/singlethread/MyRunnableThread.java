package com.java.basic.concept.JavaBasicPractice.thread.singlethread;

public class MyRunnableThread implements Runnable {

	String name;
	Thread thread;

	public MyRunnableThread(String threadname) {
		super();
		name = threadname;
		thread = new Thread(this, name);
		System.out.println("New MyRunnableThread " + name);
		System.out.println("MyRunnableThread " + name + " : " + thread.getState());
		thread.start();
		System.out.println("MyRunnableThread " + name + " : " + thread.getState());
	}

	@Override
	public void run() {
		System.out.println("MyRunnableThread " + name + " running..");
		try {

			for (int i = 0; i < 5; i++) {
				System.out.println("MyRunnableThread " + name + " : " + i);
				// thread.interrupt();
				Thread.sleep(1000);
				// System.out.println(name + " " + thread.getState());
			}
		} catch (InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
