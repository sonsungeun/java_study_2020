package com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04 e4 = new Ex04();
		e4.add();
		System.out.println(e4.k1);
		
		e4.plus(5);
		System.out.println(e4.k1);
		
		e4.calc(100, 4);
		System.out.println(e4.k1);
		
		e4.s_add("호돌이");
		System.out.println(e4.str);
		
		
	}
}
