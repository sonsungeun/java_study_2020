package com.ict.edu5;

// 임계영역 : 멀티스레드에서 공통으로 사용되는 영역
//			  현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗기는 
//			  문제가 발생하기 때문에 이를 방지하기 위해
//			  동기화처리를 이용한다.

// 동기화처리 : 임계영역에 synchronized 예약어를 사용하면 된다.
//				현재 실행중인 스레드가 끝날때까지 다른 스레드는 접근할 수 없다.

public class Ex01 implements Runnable {
	int x;
	
	@Override
	public synchronized void run() {
for (int i = 0; i < 50; i++) {
	System.out.println(Thread.currentThread().getName()+": "+x++);
}		
	}
}
