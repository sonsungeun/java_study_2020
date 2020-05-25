package com.ict.edu2;

public class Ex03 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" : 가가가가가가가가가가");
		}
	}
}

