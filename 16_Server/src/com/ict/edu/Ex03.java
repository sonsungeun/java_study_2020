package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable {
	ServerSocket ss = null;

	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중 ....");

			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				Socket s = ss.accept();		//접속자 정보는 소켓이 가지고 있음
				System.out.println("ip : "+s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());

	}
}
