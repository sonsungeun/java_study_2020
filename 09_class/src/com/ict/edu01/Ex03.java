package com.ict.edu01;

enum Type2{
	// 상수("연결할 문자")
	WALKING("워킹화",270), RUNNING("러닝화",250), TRACKING("트래킹화",260), HIKING("등산화",240);
	
	final private String name;
	final private int size;
	
	// 생성자 역할을 한다.
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
		
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
// 이렇게 만들면 객체로 만들어서 배열에 넣는것이랑 차이가 없음
// 유동적인 값은 쓸수없음 enum이 상수이므로
public class Ex03 {
public static void main(String[] args) {
	for (Type2 k : Type2.values()) {
		System.out.println(k.name()+" : "+k.getName()+" , "+k.getSize());
	}
}
}
