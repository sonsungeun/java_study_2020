package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Hw0518 {
//1. 높음/ 낮음 맞추기
// 컴퓨터가 난수 생성(짝수, 홀수) 내가 맞추고
// 계속할까요?(y,n으로대답)
// 승률 계산
//1-1)카드게임 : 1~13의수 
//				1~6 낮음, 7비김,8~13높음

//2. 가위,바위,보 게임
// 케이스 3*3=9가지

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String res = "";
		int count = 0;
		int win = 0;
		
		esc: while (true) {
			
			int com = ran.nextInt();
			if (com % 2 == 0) {
				res = "낮음";
			} else if (com % 2 == 1) {
				res = "높음";
			}
			System.out.println(res);
			System.out.print("높음/낮음 선택하세요 >> ");
			count++;
			String input = sc.next();
			if (input.contains(res)) {
				System.out.println("맞았습니다.");
				win++;
			} else {
				System.out.println("틀렸습니다.");
			}
			System.out.println("계속할까요?(Y/N)");
			String con = sc.next();
			if (con.equalsIgnoreCase("Y")) {
				continue esc;
			} else if (con.equalsIgnoreCase("N")) {
				break esc;
			}

		}
		System.out.println("판 수 : "+count+"\t이긴 판 수 :"+win+"\t승률 : "+(double)(win)/count*100+"%");
		System.out.println("감사합니다.");

	}
}
