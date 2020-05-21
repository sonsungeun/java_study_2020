package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

//2. 가위,바위,보 게임
//케이스 3*3=9가지
public class Hw2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int com = (int) (ran.nextDouble() * 4);
		String coms = "";
		switch (com) {
		case 1:
			coms = "가위";
			break;
		case 2:
			coms = "바위";
			break;
		case 3:
			coms = "보";
			break;
		}
		int count = 0;
		int win = 0;

		esc: while (true) {
			System.out.print("가위/바위/보 게임 >> ");
			String me = sc.next();
			count++;
			int myres = 1;
			switch (me) {
			case "가위":
				myres = 1;
				break;
			case "바위":
				myres = 2;
				break;
			case "보":
				myres = 3;
				break;
			}
			System.out.println("컴퓨터 >> " + coms);
			if (com == 1) {
				switch (myres) {
				case 1:
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("이겼습니다.");
					win++;
					break;
				case 3:
					System.out.println("졌습니다.");
					break;
				}
			} else if (com == 2) {
				switch (myres) {
				case 1:
					System.out.println("졌습니다.");
					break;
				case 2:
					System.out.println("비겼습니다.");
					break;
				case 3:
					System.out.println("이겼습니다.");
					win++;
					break;
				}
			} else if (com == 3) {
				switch (myres) {
				case 1:
					System.out.println("이겼습니다.");
					win++;
					break;
				case 2:
					System.out.println("졌습니다.");
					break;
				case 3:
					System.out.println("비겼습니다.");
					break;
				}
			}
			System.out.print("다시하시겠습니까?(Y/N) >> ");
			String re = sc.next();
			if (re.equalsIgnoreCase("Y")) {
				continue esc;
			} else if (re.equalsIgnoreCase("N")) {
				break esc;
			}
		}
		System.out.println(count + "판 play 결과 : " + win + "승 " + (count - win) + "패, 승률 : "
				+ (int) ((double) (win) / count * 100) + "%");
		System.out.println("★★★★★★이용해주셔서 감사합니다.★★★★★★");
	}
}
