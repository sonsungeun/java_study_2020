package com.ict.edu;

public class Ex01 {
public static void main(String[] args) {
	// Thread.currentThread() -> 현재 실행중인 스레드
	// .getName() -> 의 이름 호출
	System.out.println(Thread.currentThread().getName());
	
	Ex02 test = new Ex02();
	test.play();
	System.out.println(1);
	String str = test.sound();
	System.out.println(str);
	System.out.println(2);
	System.out.println("===================");
	
	Ex03 test2 = new Ex03();
	
	System.out.println(Thread.currentThread().getName()+" : 1");
	test2.go();
	System.out.println(Thread.currentThread().getName()+" : 2");
	
	//test2.run();
	//싱글스레드
	test2.start();
	//start() -> run() : 스레드생성 (Thread -0 = 새일꾼 생성, thread-0이 실제 run()수행하고 
	//이와상관없이 메인메소드는 본래 하던 일을 끝마쳐서 main:3이 먼저 출력됨)
	// 멀티 스레드
	System.out.println(Thread.currentThread().getName()+" : 3");

	
}
}
