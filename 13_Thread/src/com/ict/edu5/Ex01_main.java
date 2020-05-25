package com.ict.edu5;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01 t1 = new Ex01();

		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
	}
}
