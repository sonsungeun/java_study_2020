package com.ict.edu;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 이클립스에서 API 호출 : 해당클래스에 커서를 놓고 shift + f2
		// 랜덤 : Math.random(), Random 클래스

		System.out.println("1.=====================");
		// 1. Random클래스
		Random ran = new Random();

		// 각종 자료형을 난수로 발생 : 자료형 범위 안에서 난수발생
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());

		// float와 double은 0.0 이상 - 1.0 미만에서 난수 발생
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());

		// 특정 범위를 지정하는 방법 :
		// 1. nextInt(범위) : 0 - 범위 전까지 정수에서 난수를 발생
		System.out.println("범위 지정 : " + ran.nextInt(5)); // 0-4까지에서 난수
		// 2. (int)(nextDouble()*범위) : 0 - 범위 전까지 정수에서 난수를 발생
		System.out.println("범위 지정 : " + (int) (ran.nextDouble() * 5)); // 0-4까지에서 난수

		System.out.println("2.======================");
		// 2. Math클래스 : 전체 메소드가 static이므로 객체 생성 없이 호출 가능
		System.out.println("1)++++++++++++++++++++++");
		// 1) random()
		System.out.println(Math.random()); // 0.0 이상 - 1.0 미만에서 난수 발생
		// 특정 범위 지정할 수 있다.
		System.out.println((int) (Math.random() * 6)); // 0.0 이상 - 5.0 미만에서 난수 발생
		System.out.println("2)++++++++++++++++++++++");
		// 2) abs : 절대값 추출
		System.out.println(Math.abs(-154));
		System.out.println("3)++++++++++++++++++++++");
		// 3) ceil(double x) 올림, round(double x) 반올림, floor(double x) 버림
		System.out.println("올림 : " + Math.ceil(3.45)); // 4
		System.out.println("올림 : " + Math.ceil(3.55)); // 4

		System.out.println("반올림 : " + Math.round(3.45)); // 3
		System.out.println("반올림 : " + Math.round(3.55)); // 4

		System.out.println("버림 : " + Math.floor(3.45)); // 3
		System.out.println("버림 : " + Math.floor(3.55)); // 3
		System.out.println("4,5)++++++++++++++++++++++");
		// 4) max(자료형 a, 자료형 b) : 둘 중 큰 값 출력
		// 5) min(자료형 a, 자료형 b) : 둘 중 작은 값 출력
		System.out.println("max : " + Math.max(45.6, 45));
		System.out.println("min : " + Math.min(45.6, 45));
		// 6) pow(double a, double b)
		System.out.println("2의 3승 : " + Math.pow(2, 3));// 2의 3승 =>8.0
		System.out.println("3의 2승 : " + Math.pow(3, 2));// 3의 2승=>9.0
	}
}
