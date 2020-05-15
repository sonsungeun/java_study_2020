package com.ict.edu;

public class Ex06 {
	// getter : 호출하는 입장에서 메소드를 이용해서 변수값을 추출할때
	// setter : 호출하는 입장에서 메소드를 이용해서 변수값을 변경할때
	public String name = "홍길동";
	int age = 24;
	private double weight = 70.4;

	// getter : 호출하는 입장에서 메소드를 이용해서 변수값을 추출할때
	public String s_name() {
		return name;
	}

	public int s_age() {
		return age;
	}

	public double s_weight() {
		return weight;
	}

	// setter : 호출하는 입장에서 메소드를 이용해서 변수값을 변경할때
	public void re_name(String s) {
		name = s;
	}
	public void re_age(int s) {
		age = s;
	}
	public void re_weight(double s) {
		weight = s;
	}

}
