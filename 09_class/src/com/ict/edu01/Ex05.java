package com.ict.edu01;

// 1. Member 내부 클래스 // 3. static 내부클래스
public class Ex05 {
	// 멤버필드
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	// 생성자
	public Ex05() {
		System.out.println("외부 : " + this);
	}

	// 외부클래스 멤버메소드
	public void play() {
		int money = 10000;

		// 지역변수는 static 사용 불가
		// static int time = 120;
		// static final int time = 120;

		System.out.println("외부메소드 : " + money);
	}

	// Member 내부클래스
	public class Inner01 {
		int k1 = 100;
		// static 사용 못함 => 클래스에 static 붙이면 사용 가능해짐
		// static int k2 = 200;

		// 상수는 사용가능-Member 내부클래스
		static final int k2 = 200;

		public Inner01() {
			System.out.println("내부생성자" + this);
		}

		public void prn() {
			System.out.println(k1);
			System.out.println(Inner01.k2);
			// 외부 클래스의 멤버를 마음대로 사용할 수 있다.
			System.out.println(name);
			System.out.println(age); // private도 사용 가능
			System.out.println("=========================");
			// 외부클래스의 메소드 호출 가능
			play();
		}

	}// 내부클래스 끝

	// static 내부클래스
	public static class Inner02 {
		int a1 = 100;
		final int a2 = 200;
		static int a3 = 300; // 클래스 static을 붙이지 않으면 오류
		static final int a4 = 400;

		public void go() {
			// 외부클래스의 인스턴스 전역변수 못가져옴
			// System.out.println(name);
			// System.out.println(age);

			// 외부클래스의 static
			System.out.println(gender);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}

		// static메소드는 static만 사용 가능
		public static void go2() {
			System.out.println(gender);
			// System.out.println(a1);
			// System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
	}

}// 외부클래스 끝
