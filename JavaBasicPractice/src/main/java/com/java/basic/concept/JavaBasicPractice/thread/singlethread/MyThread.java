package com.java.basic.concept.JavaBasicPractice.thread.singlethread;

public class MyThread extends Thread {

	public MyThread() {
		System.out.println("MyThread");
	}

	public MyThread(Runnable target) {
		super(target);
		System.out.println("MyThread Runnable");
	}

	public MyThread(String name) {
		super(name);
		System.out.println("MyThread");
	}

	public MyThread(ThreadGroup group, Runnable target) {
		super(group, target);
		System.out.println("MyThread ThreadGroup Runnable");
	}

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
		System.out.println("MyThread ThreadGroup Name");
	}

	public MyThread(Runnable target, String name) {
		super(target, name);
		System.out.println("MyThread Runnable name");
	}

	public MyThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		System.out.println("MyThread");
	}

	public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		System.out.println("MyThread");
	}

	public void run() {
		System.out.println("MyThread running");
		System.out.println("Thread currentThread : " + Thread.currentThread());
		System.out.println(this.getName() + " State : " + this.getState());
		// Thread.sleep(10000);
		try {
			MyThread.sleep(1000);
			System.out.println(this.getName() + " State : " + this.getState());
			// this.interrupt();
		} catch (InterruptedException e) {
			System.out.println(this.getName() + " Interrupted -> " + this.isInterrupted());
			System.out.println("...............................");
			Thread.currentThread().dumpStack();
			System.out.println("...............................");

		}
		System.out.println(this.getName() + " State : " + this.getState());
		System.out.println(this.getName() + " exiting.");
	}
}
