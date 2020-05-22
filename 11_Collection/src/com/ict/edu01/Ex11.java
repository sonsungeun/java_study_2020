package com.ict.edu01;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		// Map인터페이스 : Key와 Value로 매핑하는 구조로 이루어짐
		// key는 중복될 수 없다.
		// key를 호출하면 value가 나온다.
		// key를 별도로 관리 => keyset()
		// add로 추가 못함.
		// put(key, value)로 추가한다.

		// Map생성(key 숫자로 만든다.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 추가 : put(k,v)
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "태국");
		map1.put(3, "영국");// key가 중복되면 value값을 덮어쓴다
		map1.put(4, "영국");
		map1.put(5, "한국");// value의 중복은 상관없다.
		map1.put(6, "한국");// value의 중복은 상관없다.

		System.out.println(map1);

		// 하나씩 출력(get(key)=>key에 해당되는 value가 나온다)
		System.out.println(map1.get(4));
		System.out.println(map1.get("한국"));// value넣는것 의미 없음.

		// 일부러 key값을 0부터 순서대로 만들었기 때문에 for문을 사용할 수 있음=>****Web에서 절대 쓰면 안됨****
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("=======================");
		// 1씩 증가하지 않아도, 일정한 규칙이 없어도 사용
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println("=======================");
		// Map생성(key를 문자열(String)로 만든다 => 일반적인방법)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "서울시 도봉구 방학동");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");

		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		System.out.println("====================");
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		//key을 호출하는 변수 it(keyset()으로) -> 호출한 걸 res에 저장 -> get(res)
		Iterator<String> it = map2.keySet().iterator();
		while (it.hasNext()) {
			String	res = (String) it.next();
			System.out.println(map2.get(res));
		}
	}
}
