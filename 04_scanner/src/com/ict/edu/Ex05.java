package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String res = "";
		int count = 0; // 전체횟수 count;
		int even = 0; // 짝수 count;

		esc: while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				res = "짝수";
				even++;
			} else if (num % 2 == 1) {
				res = "홀수";
			}
			System.out.println(num + "는 " + res + " 입니다.");
			while (true) {
				System.out.print("계속할까요? (1.Yes, 2.No) >> ");
				int pick = sc.nextInt();
				if (pick == 1)
					continue esc;
				else if (pick == 2)
					break esc;
				else
					System.out.println("제대로 입력하세요.");
				continue;
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println("총 " + count + "번 count했습니다.");
		System.out.println("짝수는 " + even + "번 count했습니다.");
		System.out.println("홀수는 " + (count - even) + "번 count했습니다.");

	}
}
