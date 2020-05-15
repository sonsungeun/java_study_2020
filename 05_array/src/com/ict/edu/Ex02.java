package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 반드시 같은 자료형이어야만 한다.
		// 생성 할 때 크기를 지정하고, 지정된 크기는 변경 불가
		// 배열을 출력할때는 일반적으로 for문을 사용한다.

		// 배열 생성 순서 ; 선언 -> 생성 -> 데이터 저장

		// 선언과 생성을 한번에
		char[] ch = new char[4];

		// 데이터 저장
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65;		// 0 ~ 65535사이에 있는 숫자는 char로 집어넣을 수 있다.
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("\n================");
		for (char k : ch) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("===============");
		
		// 선언, 생성, 데이터 저장을 한번에
		char[] ch2 = {'j','a','v','a'};
		int[] k2 = {100,200,300,400};
		double[] d2 = {3.14,71.0,42.1};
		String[] str = {"안","녕","하","세","요"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
