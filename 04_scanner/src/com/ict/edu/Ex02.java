package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 숫자를 받아서 홀수, 짝수를 구분하자.
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		String res = "";
		if (su1 % 2 == 0) {
			res = "짝수";
		} else if (su1 % 2 == 1) {
			res = "홀수";
		}
		System.out.println("결과 : " + res);
		// 나라를 입력하면 수도가 출력되게 하자
		// 1.한국=서울, 2.중국=베이징,3.일본=도쿄 나머지는 데이터 없음
		System.out.print("나라입력 : 1.한국=서울 2.중국=베이징 3.일본=도쿄 >>");
		int country = sc.nextInt();
		res = "";
		switch (country) {
		case 1:
			res = "서울";
			break;
		case 2:
			res = "베이징";
			break;
		case 3:
			res = "도쿄";
			break;
		default:
			res = "데이터 없음";
			break;
		}
		System.out.println("결과 : " + res);

		// 근무시간이 8시간까지는 시간다 8590원이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 근무시간을 입력해서 알바금액을 산정하자.
		System.out.print("근무시간을 입력하시오.");
		int time = sc.nextInt();
		int dan = 8590;
		int pay = 0;
		if (time > 8) {
			pay = (int) ((time - 8) * 1.5 * dan) + 8 * dan;
		} else {
			pay = time * dan;
		}
		System.out.println("알바비 : " + pay);

		// menu가 1이면 카페모카 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 메뉴를 고른 결과와 잔돈을 출력(단, 부가세 10% 포함)
		System.out.print("menu 선택 : \n1.카페모카(3500)\n2.카페라테(4000)\n3.아메리카노(3000)\n4.과일쥬스(3500) >> ");
		int num = sc.nextInt();
		String drink = "";
		int input = 10000;
		dan = 0;
		int su = 2;
		int vat = 0;
		int total = 0;
		int output = 0;
		switch (num) {
		case 1:
			drink = "카페모카(3500)";
			dan = 3500;
			break;
		case 2:
			drink = "카페라테(4000)";
			dan = 4000;
			break;
		case 3:
			drink = "아메리카노(3000)";
			dan = 3000;
			break;
		case 4:
			drink = "과일쥬스(3500)";
			dan = 3500;
			break;
		default:
			drink = "1 ~ 4 중에 입력하십시오.";
			break;
		}
		dan = su * dan;
		vat = (int) (dan * 0.1);
		total = dan + vat;
		output = input - total;
		System.out.println(drink + "를 " + su + "잔 선택하셨습니다. 가격은 " + total + "입니다.");
		System.out.println("잔돈은 " + output + "입니다.");
	}
}
