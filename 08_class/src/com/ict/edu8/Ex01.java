package com.ict.edu8;

// 인터페이스 : 목적 - 서비스를 제공하는 목록을 말한다.
//				상수와 추상메소드들로 구성되어있다.
//				생성자 X => 객체 생성 X
//				유일하게 다중상속이 가능하다.
//			** 	'인터페이스가 같다.'라는 말은 대체가 가능하다(=호환이 가능하다.)
//
public interface Ex01 {
	// 모두 다 static final
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;

	// 추상메소드가 아니라서 오류 발생
	// public void play() {}

	// 일반적인 추상메소드
	public abstract void play();

	// interface에서는 abstract 예약어를 사용하지 않아도 오류가 안난다.
	public void sound();
}
