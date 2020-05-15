package com.ict.edu;

public class Ex04 {
	int k1 = 10;
	String str = "";

	// 인자(매개변수) : 외부에서 정보를 받아서 사용
	// 메소드 이름은 같으나 자료형이 다르면 오류 안생김
	// => 오버로딩
	public void add() {
		k1++;
	}

	public void add(int s) {
		k1 = k1 + s;
	}

	public void add(float s) {
		k1 = k1 + (int) (s);
	}

	public void add(double s) {
		k1 = k1 + (int) (s);
	}

	public void add(int s1, int s2) {
		k1 = s1 + s2;
	}

	public void add(String s) {
		str = s;
	}

	// 받는 자료형의 개수와 숫자가 같지만, 인자의 순서가 다르면 오류 안생김
	public void add(int s1, String s2) {
		k1 = s1;
		str = s2;
	}

	public void add(String s2, int s1) {
		k1 = s1;
		str = s2;
	}

/////////////////////////////////////////////////////////////////////////////
	public void plus(int s) {
		k1 = k1 + s;
	}

	public void calc(int s1, int s2) {
		k1 = s1 + s2;
	}

	public void s_add(String s) {
		str = s;
	}
}
