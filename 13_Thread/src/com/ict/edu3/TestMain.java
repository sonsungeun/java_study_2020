package com.ict.edu3;


public class TestMain {
public static void main(String[] args) {
	Ex01 testA = new Ex01();
	Ex02 testB = new Ex02();
	
	// testA, testB는 Runnable을 가지고 구현하였으므로
	// start가 없다.
	// start -> run()으로 가지 않으면 스레드처리가 아니다.
	// testA.run();
	// testB.run();
	
	// start()는 Thread클래스가 가지고 있으므로
	// Thread 클래스를 활용해야 된다.
	
	// 방법1 : Runnable을 상속받은 객체를 Thread생성자에 넣어준다.
	Thread thread = new Thread(testA);
	thread.start();
	
	new Thread(testB).start();
	
	// 방법2 : 안드로이드에서 사용하는 방법(익명내부클래스)
	new Thread(new Runnable() {	
		@Override
		public void run() {
while (true) {
	System.out.println(Thread.currentThread().getName() +" : 가가가가가");
}			
		}
	}).start();
}
}
