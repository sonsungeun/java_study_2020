package com.ict.edu5;

public class Ex02_main {
public static void main(String[] args) {
	Ex02 e2 = new Ex02();
	Thread t1 = new Thread(e2, "Tom");
	Thread t2 = new Thread(e2, "Jerry");
	t1.start();
	t2.start();
}
}
