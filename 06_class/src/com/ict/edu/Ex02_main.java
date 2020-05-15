package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		// static 멤버필드 호출
		System.out.println(Ex02.com);
		System.out.println(Ex02.eng);
//	System.out.println(Ex02.kor);  	//인스턴스 변수라서 객체생성 이전에 호출 불가
//	System.out.println(Ex02.math);	//인스턴스 상수라서 객체생성 이전에 호출 불가

		// Ex02 클래스 객체 만들기
		// 클래스이름 참조변수 = new 생성자;
		// Ex02에 생성자가 없으면 기본생성자로 생성;
		Ex02 test = new Ex02();

		// 멤버필드 호출
		System.out.println(test.kor);
		System.out.println(test.math);
		System.out.println(test.eng);
		System.out.println(Ex02.eng);// 올바른 static 변수 호출법
		System.out.println(test.com);
		System.out.println(Ex02.com);// 올바른 static 상수 호출법

		// 주소 출력
		System.out.println(test);
		System.out.println("==================================================");
		// API를 이용해서 static 메소드와 인스턴스를 호출해 보자
		// API에서 제공하는 Random 클래스의
		// nextInt(), nextInt(int bound), nextDouble()을 사용하는 예이다.

		// nextInt(), nextInt(int bound), nextDouble()은 static이 아니므로
		// 클래스를 객체로 만들어서 사용해야 된다.

		// 1. 클래스를 객체로 만드는 방법
		// 클래스 참조변수 = new 생성자
		Random ran = new Random();
		int res = ran.nextInt();
		System.out.println(res);
		System.out.println("==================================================");

		// nextInt(bound) : 반환값( 0 - bound전까지 )
		int res1 = ran.nextInt(6); // 0 ~ 5 까지
		System.out.println(res1);
		System.out.println("==================================================");

		// 정해지지 않은 0.0 이상 ~ 1.0 미만의 실수
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("==================================================");

		// res2를 0~5까지의 정수로 표현하자.(좀 더 난수를 많이 발생시키기)
		System.out.println((int) (res2 * 6));

		// API에서 제공하는 static 메소드 사용하기
		// Math클래스의 메소드들은 static이므로 객체 생성 없이 사용 가능하다.
		System.out.println(Math.random());				// 0.0 이상 ~ 1.0 미만의 난수

		// 원하는 정수까지므로 정해지지 않은 수 지정
		System.out.println((int) (Math.random() * 6));	// 0~5까지의 난수
	}
}
