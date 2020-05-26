package com.ict.edu01;

import java.util.HashSet;

public class Ex05_re {
	public static void main(String[] args) {
		// 배열 -> 컬렉션
		String[] arr = { "JAVA", "자바", "java", "Java" };
		HashSet<String> h1 = new HashSet<String>();
		HashSet<String> h2 = new HashSet<String>();
		HashSet<String> h3 = new HashSet<String>();

		for (String k : arr) {
			// arr에 있는 요소를 컬렉션에 넣기
			h1.add(k);
		}

		// h1의 모든 요소를 h2에 넣기
		h2.addAll(h1);

		// h1에 요소 추가
		h1.add("HTML");
		h1.add("CSS");

		// h2에서 "자바"삭제, h2에 다른 정보 넣기
		h2.remove("자바");
		h2.add("JSP");
		h2.add("android");
		h2.add("Python");

		// 중복검사(h1과 h2에 공통적으로 있는 요소 뽑아내보기)
		for (String k : h2) {
			if (!h1.add(k)) {
				h3.add(k);
			}
		}
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
