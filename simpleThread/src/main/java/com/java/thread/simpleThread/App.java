package com.java.thread.simpleThread;

public class App {
	public static void main(String[] args) {

		Thread thread = new Thread(new MyThread());
		Thread thread1 = new Thread(new com.java.thread.simpleThread.thread.MyThread());
		thread.start();
		thread1.start();

	}

	private static class MyThread implements Runnable {
		public void run() {
			System.out.println("Static class MyThread ");
		}
	}
}
