package com.practice.session33;

public class Session33Practice implements Runnable {
		
	public static void main(String[] args) {
		Session33Practice obj = new Session33Practice();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}
}











