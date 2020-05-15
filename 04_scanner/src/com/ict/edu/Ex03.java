package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 반복횟수 : ");
		int su = sc.nextInt();

		System.out.println("원하는 단어 : ");
		String str = sc.next();

		for (int i = 0; i < su; i++) {
			System.out.println(str);
		}

	}
}
