package com.ict.edu01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도를 각각 HashMap에 저장 시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("대한민국", "서울");
		map1.put("한국", "서울");
		map1.put("korea", "서울");
		map1.put("캐나다", "오타와");
		map1.put("영국", "런던");
		map1.put("스위스", "베른");

		Set<String> set = map1.keySet();
		System.out.println(set);
		while (true) {
			System.out.print("나라를 입력 >>");
			String str = sc.next();
			str = str.toLowerCase();
			if (set.contains(str)) {
				String res = map1.get(str);
				System.out.println(str+"의 수도는 " +res+"입니다.");
			}else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			System.out.print("계속할까요?(Y/N) >> ");
			String msg = sc.next();
			if (msg.equalsIgnoreCase("n")) {
				break ;
			}
		}
	}
}
