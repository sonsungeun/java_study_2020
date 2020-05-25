package com.ict.edu3;

// Runnable 인터페이스는 추상메소드 run()만 가지고 있다.
public class Ex01 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+": 11111");
		}
		play();
	}
	
	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+": #####");
		}
	}
}
