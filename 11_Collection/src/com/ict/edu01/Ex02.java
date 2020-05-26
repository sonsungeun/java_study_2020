package com.ict.edu01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복안됨, 정렬안됨(TreeSet은 항상 오름차순상태)

		// 컬렉션 생성 : HashSet<제네닉=객체타입=클래스> 참조변수 = new HashSet <제네닉>();
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();

		// 해당 컬렉션에 객체 넣기( 일반 객체로 만든 후 넣어야 된다.)
		// 1. 객체로 만들기
		Integer k1 = new Integer(10);// 박싱
		Integer k2 = new Integer("20");

		// 2. 컬렉션에 넣기(add)
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50);// 오토박싱 : 자료형 int 10을 자동으로 객체로 만들어서 넣어준다.
		h1.add(60);// 오토박싱 : 자료형 int 10을 자동으로 객체로 만들어서 넣어준다.

		// Double넣기
		Double d1 = new Double(10);
		Double d2 = new Double("20");

		h2.add(d1);
		h2.add(d2);
		// 오토박싱은 무조건 자료형이 맞아야 들어간다.
		// h2.add(10);//자료형은 자동형변환가능, but 컬렉션은 자료형이 다르면 아예 들어갈 수 없음
		h2.add(10.0);
		h2.add(20.0);
		h2.add(30.0);
		h2.add(40.0);

		h3.add(true);
		h3.add(false);
		h3.add(true);// 오류는 나지 않지만 들어가지 않음(중복허용하지 않음)

		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');// 오류는 나지 않지만 들어가지 않음(중복허용하지 않음)

		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");

		System.out.println("======================");
		System.out.println("전체내용보기");

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		System.out.println("======================");
		System.out.println("하나씩 보기<개선된FOR, iterator>");

		for (Integer k : h1) {
			System.out.print(k + " ");
		}
		System.out.println();
		// 언박싱 (오토박싱의 반대) : 객체를 일반적으로 사용하는 자료형으로 변환
		for (int k : h1) {
			System.out.print(k+1+ " ");
		}
		System.out.println();
		System.out.println("하나씩 보기");
		Iterator<Double> it = h2.iterator();
		// .hasNext() : 다음 객체가 존재하면 true,
		// .next() : 다음 객체로 꺼내기 위해서 이동하고, 반환한다.
		while (it.hasNext()) {
			Double res = (Double) it.next();
			System.out.print(res + " ");
		}
		System.out.println();
		Iterator<Boolean> it1 = h3.iterator();
		while (it1.hasNext()) {
			boolean res1 = (boolean) it1.next();
			System.out.print(res1 + " ");
		}
		System.out.println();
		// h4,h5 출력
		Iterator<Character> it3 = h4.iterator();
		while (it3.hasNext()) {
			Character res2 = (Character) it3.next();
			System.out.print(res2 + " ");
		}
		System.out.println();
		Iterator<String> it4 = h5.iterator();
		while (it4.hasNext()) {
			String res3 = (String) it4.next();
			System.out.print(res3 + " ");
		}
		System.out.println();
	}
}
