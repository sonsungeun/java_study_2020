package com.mytest;

public class T_Sub extends T_Sup {
	String addr;
	int car;

	public T_Sub() {
		this("서울 홍대입구");
		System.out.println("자식생성자1");
	}

	public T_Sub(int car) {
		this.car = car;
	}

	public T_Sub(String addr) {
		this.addr = addr;
		System.out.println("자식생성자2");
	}

	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}

	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;
	}
}
