package com.ict.edu;

public class Ex02 {

	public void play() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Ex02의 play()");
	}

	public String sound() {
		System.out.println(Thread.currentThread().getName());
		return "Hello";
	}
}
