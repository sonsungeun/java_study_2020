package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02 implements Runnable {
	static ServerSocket ss;
public static void main(String[] args) {
	
	try {
		ss = new ServerSocket(7777);
		System.out.println("서버 대기중 ....");
		Ex02 e2 = new Ex02();
		Thread thread = new Thread(e2);
		thread.start();
		
	} catch (Exception e) {
	}
}

@Override
public void run() {
while (true) {
	try {
		Socket s = ss.accept();
		System.out.println("ip : "+s.getInetAddress().getHostAddress());
	} catch (IOException e) {
		e.printStackTrace();
	}
}	
}
}
