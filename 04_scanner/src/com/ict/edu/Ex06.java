package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이름, 국어, 영어, 수학 정보를 받아서
		// 이름, 총점, 평균, 학점 출력
		esc: while (true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();

			int sum = korean + eng + math;
			double avg = (int) ((sum / 3.0) * 10) / 10.0;
			String score = "";
			if (avg >= 90) {
				score = "A";
			} else if (avg >= 80) {
				score = "B";
			} else if (avg >= 70) {
				score = "C";
			} else {
				score = "F";
			}
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + score);
			while (true) {
				System.out.print("계속하시겠습니까?(1.yes, 2.no)");
				int choice = sc.nextInt();
				if (choice == 1) {
					continue esc;
				} else if (choice == 2) {
					break esc;
				} else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}
