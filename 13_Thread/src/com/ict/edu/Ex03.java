package com.ict.edu;

// Thread 클래스는 start(), run() 가 존재한다.
public class Ex03 extends Thread {

	public void go() {
		System.out.println(currentThread().getName()+"go() 메소드");
	}
	public void run() {
		System.out.println(currentThread().getName()+"run() 메소드");
	}
}
