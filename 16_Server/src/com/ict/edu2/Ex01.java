package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Eco Server :  받은 내용을 그대로 돌려준다.
public class Ex01 implements Runnable {
	ServerSocket ss = null;
	
	// 정보를 받기 위한 스트림 처리(바이트스트림)
	InputStream is;
	BufferedInputStream bis;
	OutputStream os;
	BufferedOutputStream bos;
	
	public Ex01() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("에코서버 대기중 ....");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Socket s = ss.accept();
				// 클라이언트에서 데이터를 보내왔다. 서버에서 스트림처리하자
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				byte b;
				StringBuffer sb = new StringBuffer();
				while ((b=(byte)bis.read())!=-1) {
					sb.append((char)b);
				}
				//byte[] b = new byte[1024];
				//bis.read(b);
				String msg = sb.toString();
				System.out.println("받은 문자 : "+msg);
				
				
				// 클라이언트에게 보내기
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				
				bos.write(msg.getBytes());
				bos.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// 나중에 메소드가 필요하면 여기다 만들어주면 됨.
	public static void main(String[] args) {
		new Ex01();
	}
}
