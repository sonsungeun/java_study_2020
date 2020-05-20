package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
	public static void main(String[] args) {
		// 내부클래스가 별도로 객체생성(주소기호@)을 할 수 없다.

		// 외부클래스 통해서 객체 생성해야 한다.
		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
		// private이므로 오류
		// System.out.println(e5.age);
		e5.play();
		System.out.println("=========================");

		// Member 내부클래스(주소기호 $)
		// 잘못된방법인 이유=> 새로운 ex05객체 안에 다시 내부클래스 생성하는 것임
		Ex05.Inner01 inner01 = new Ex05().new Inner01();
		System.out.println("=========================");
		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();

		System.out.println("----------------------------");
		// static 내부클래스 호출
		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		
		System.out.println("----------------------------");
		// static 내부클래스는 외부클래스를 통하지 않고 만들 수 있다.
		Inner02 test = new Inner02();
		System.out.println(test.a1);
		System.out.println(test.a2);
		test.go();
	}
}
