package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 e6 = new Ex06();
		
		System.out.println(e6.name);
		String s = e6.s_name();
		System.out.println(s);
		System.out.println();
		
		System.out.println(e6.age);
		int a = e6.s_age();
		System.out.println(a);
		
		System.out.println();
		// weight이 private이기때문에 바로 접근할 수 없다.
		// System.out.println(e6.weight);
		// 메소드를 이용해서 접근한다.(getter)
		double w = e6.s_weight();
		System.out.println(w);
		
		// 이름을 둘리로 변경하자
		e6.re_name("둘리");
		System.out.println(e6.name);
		s = e6.s_name();
		System.out.println(s);
		// 나이를 5000으로 변경하자 
		e6.re_age(5000);
		// 확인
		System.out.println(e6.age);
		a = e6.s_age();
		System.out.println(a);
		// 몸무게를 10000으로 변경하자
		// int는 double에 저장할 수 있다.
		e6.re_weight(10000);
		// 확인
		w=e6.s_weight();
		System.out.println(w);
	}
}
