package com.ict.edu5;

// 5. 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1-100까지 출력하고,
//	  두번째 스레드의 출력을 101-200까지 출력하라.(synchronized사용)
public class Ex04 implements Runnable {
	int x = 1;

	@Override
	public synchronized void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
		}
	}

	public static void main(String[] args) {
		Ex04 t = new Ex04();
		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();
	}
}
