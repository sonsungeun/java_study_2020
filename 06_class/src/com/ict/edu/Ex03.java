package com.ict.edu;

public class Ex03 {
	// 멤버메소드 : 기능
	// 반환형 : 메소드를 호출하면 해당 메소드가 실행되고 호출한 곳으로 되돌아감.
	//			실행 후 되돌아갈때 결과를 가지고 갈 경우 결과에 대한 자료형을 말한다.
	// 			만약에 결과를 가지고 가지 않으면 void 예약어 사용

	int sound = 10;
	double sound2 = 10.0;
	public void add() {
	System.out.println("add_1");
			sound++;
	System.out.println("add_2");

	}
	
	public void sub() {
		sound--;
		return;
	}
	
	public int mul() {
		System.out.println("mul_1");
		return sound;
	}
	// 자료형이 다르면 오류	
	//	public int div() {	
	//		return sound2;
	//	}
	
	// 자료형이 다르지만 반환형이 크면 오류 아님
	public double plus() {
		return sound;
	}
	
	
}
