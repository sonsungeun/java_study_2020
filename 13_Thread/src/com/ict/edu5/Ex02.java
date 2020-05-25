package com.ict.edu5;
// 674p car, producer, customer, main 쳐오기
// 멈췄다, 풀었다 - > wait(), notify();


public class Ex02 implements Runnable {
	@Override
	public void run() {
		kitchen();
		bedroom();
	}

	public void kitchen() {
		System.out.println(Thread.currentThread().getName() + " is in kitchen");
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(Thread.currentThread().getName() + " is leaving kitchen");
	}

	public synchronized void bedroom() {
		System.out.println(Thread.currentThread().getName() + " is in bedroom");
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(Thread.currentThread().getName() + " is leaving bedroom");

	}
}
