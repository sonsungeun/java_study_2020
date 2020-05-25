package com.ict.edu4;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//				 일반스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨

public class Ex01 implements Runnable {
	boolean autoSave = false;
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000 * 3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
System.out.println(1);
		}
	}
	public void autoSave() {
		System.out.println("작업파일을 자동 저장합니다.");
	}
	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		thread.setDaemon(true);
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
}
