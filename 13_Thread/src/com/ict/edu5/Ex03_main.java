package com.ict.edu5;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		Thread thread = new Thread(test, "dog");
		thread.start();
		
		Thread thread1 = new Thread(test, "cat");
		thread1.start();
	}
}
