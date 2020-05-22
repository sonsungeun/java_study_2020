package com.ict.debugging;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		String msg = sc.next();

		String msg2 = test.setData(msg);
		System.out.println(msg2);

		int msg3 = Integer.parseInt(msg2);

		for (int i = 1; i < 10.; i++) {
			System.out.println(msg2 + " * " + i + " = " + (msg3 * i));
		}
	}

	public String setData(String msg) {
		String str = null;
		if (msg.length() >= 1) {
		 str = msg.substring(0, 1);
		}
		return str;
	}
}
