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

		Random ran = new Random();
		int computer = ran.nextInt();
		String res = "";
		int count = 0;
		int win = 0;
		con: while (true) {
			if (computer % 2 == 0) {
				res = "높음";
			} else if (computer % 2 == 1) {
				res = "낮음";
			}
			Scanner sc = new Scanner(System.in);
			String my = sc.next();
			count++;
			if (my.equals(res)) {
				System.out.println("맞았습니다!");
				win++;
			} else {
				System.out.println("틀렸습니다.");

			}
			System.out.println("승률 : " + win / count * 100 + "%");
			System.out.println("다시하시겠습니까?(Y/N)");
			String ans = sc.next();
			if (ans == "Y" || ans == "y") {
				continue con;
			} else if (ans == "N" || ans == "n") {
				break con;
			}
		}
		System.out.println("감사합니다.");
	}
}
