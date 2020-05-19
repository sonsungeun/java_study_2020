package com.ict.edu8;

public class Ex02 {
	public static void main(String[] args) {
		// static이라는 증거 => 객체 생성 없이 호출 가능
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU3);
		System.out.println(Ex01.SU4);

		// final이라는 증거 => 값 변경이 안된다.
		// System.out.println(Ex01.su1++);
		// System.out.println(Ex01.su2++);
		// System.out.println(Ex01.SU3++);
		// System.out.println(Ex01.SU4++);

	}
}
