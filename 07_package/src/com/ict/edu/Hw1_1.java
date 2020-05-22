package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

//1-1)카드게임 : 1~13의수 
//1~6 낮음, 7비김,8~13높음
public class Hw1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String res = "";
		int count = 0;
		int win = 0;
		esc: while (true) {
			System.out.print("낮음/높음 >> ");
			count++;
			String me = sc.next();
			int com = (int) (ran.nextDouble() * 13) + 1;
			if (com >= 1 && com <= 6) {
				res = "낮음";
			} else if (com == 7) {
				res = "비김";
			} else if (com >= 8 && com <= 13) {
				res = "높음";
			}
			if (me.equals(res)) {
				System.out.println("♣축하합니다~! 맞았습니다.");
				win++;
			} else if (res.contains("비김")) {
				System.out.println("♣비겼습니다.");
			} else {
				System.out.println("♣틀렸습니다.");
			}
			esc1: System.out.print("다시하시겠습니까?(Y/N) >> ");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("n")) {
				break esc;
			} else if (choice.equalsIgnoreCase("y")) {
				continue esc;
			}
		}
		System.out.println("이용한 판수 : " + count + ", 승률 : " + (int) ((double) (win) / count * 100) + "%");
		System.out.println("★★★★이용해주셔서 감사합니다.★★★★");

	}
}
