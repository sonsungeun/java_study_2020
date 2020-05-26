package com.ict.edu01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public final class Ex12_re {
	// 대한민국, 캐나다, 영국, 스위스의 수도를 각각 HashMap에 저장 시키고
	// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		
		while (true) {
			hm.put("대한민국", "서울");
			hm.put("korea","서울");
			hm.put("캐나다", "오타와");
			hm.put("영국", "런던");
			hm.put("스위스", "베른");
			
			Set<String> set = hm.keySet();
			System.out.print("나라 입력 >>");
			String res = sc.next();
			if (set.contains(res.toLowerCase())) {
				System.out.println(res + "의 수도는 " + hm.get(res.toLowerCase()) + "입니다.");
			}else {
				System.out.println("데이터에 없는 나라입니다.");
			}

			System.out.print("다시하시겠습니까?(Y/N)");
			res = sc.next();
			System.out.println();
			if (res.equalsIgnoreCase("n")) 	break;	
		}
	}

}
