package com.ict.edu;

public class Ex02 {
	// 멤버필드 : 상태값, 속성, 특징, 데이터
	// instance필드 : 객체 생성할 때 생성되는 필드
	// static필드 : 객체 생성과 상관없이 먼저 생성되는 필드, Static표시
	// final이 있으면 => 상수
	// final이 없으면 => 변수

	int kor = 80; // 인스턴스 변수
	static int eng = 85; // static 변수
	final int math = 90; // 인스턴스 상수
	final static int com = 95; // static 상수(보통 상수 표현)

	// 변수와 상수의 차이
	// 메소드 : 기능, 동작,
	// 메소드 구성 : 접근제한자 메소드종류 반환형 메소드이름([인자=매개변수]){실행 내용}
	// void는 되돌아갈때 결과가 없다.
	public void prn() {
		// 변수이기 때문에 변경가능
		kor = kor + 10;
		eng = eng + 85;
		// 상수이기때문에 변경하면 오류 발생
		// math = math + 90;
		// com = com + 95;

	}

}
