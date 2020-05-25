package com.ict.edu2;

public class Ex01 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" : 111111111");
		}
	}
}
