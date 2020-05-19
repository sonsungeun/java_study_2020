package com.ict.edu5;

// 추상메소드를 상속받은 일반적인 클래스
// 반드시 부모의 추상메소드를 오버라이딩해서 body부분을 만든다.
public class Dog extends Animal {
	@Override
	public void like() {
		System.out.println("늦잠 자기");
	}
}
