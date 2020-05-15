package com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		System.out.println(Ex05.k1);
		System.out.println(Ex05.k2);
		System.out.println(Ex05.k3);
		// static이더라도 private은 접근못함
		// System.out.println(Ex05.k4);

		Ex05 e5 = new Ex05();
		System.out.println(e5.s1);
		System.out.println(e5.s2);
		System.out.println(e5.s3);
		// 객체를 생성해도 private은 접근못함
		// System.out.println(e5.s4);
	
	}
}
