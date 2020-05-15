package com.ict.edu;

public class Ex15 {
	// static 초기화
	// static{
	// 내용;
	// }

	int s1 = 100;
	static int s2 = 200;
	static int k2 = 2;
	// k3 = 5000;
	
	// static 초기화
	// 초기화 위에 있는것들은 무시당하고
	// 초기화 밑에 있는 값은 살아남는다
	static {
		s2 = 10000;
		s3 = 20000;
		s4 = 30000;
	}
	
	// int k3;
	static int s3 = 10;
	static int s4; // 선언을 나중에해도 오류가 아니다. java는 static만 선언오류 예외 허용

	static int k3 = 2;
	static int k4;

	public static void main(String[] args) {
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("============");
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
	}
}
