package com.java.thread.simpleThread.thread;

public class MyThread implements Runnable {

	public MyThread() {
		System.out.println("constructor  : MyThread");
	}

	public void run() {
		System.out.println("Separate class MyThread ");
	}
}
