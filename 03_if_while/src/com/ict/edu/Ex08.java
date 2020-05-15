package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// 중첩 while문 : while문 안에 while문 
		// 다중 for문과 같다.
		//

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();

		int k1 = 1;
		while (k1 < 4) {
			int g1 = 1;
			while (g1 < 6) {
				System.out.println("k1 = " + k1 + ", g1 = " + g1);
				g1++;
			}
			k1++;
		}
		// 구구단 출력하기
		int k2 = 2;
		while (k2 < 10) {
			System.out.println(k2 + "단");
			int g2 = 1;
			while (g2 < 10) {
				System.out.println(k2 + " * " + g2 + " = " + g2 * k2);
				g2++;
			}
			k2++;
		}
		System.out.println("============================");
		int k3 = 2;
		while (k3 < 10) {
			int g3 = 1;
			while (g3 < 10) {
				System.out.print(k3 + " * " + g3 + " = " + k3 * g3 + "\t");
				g3++;
			}
			System.out.println();
			k3++;
		}
		System.out.println("============================");
		int k4 = 1;
		while (k4 < 10) {
			int g4 = 2;
			while (g4 < 10) {
				System.out.print(g4 + " * " + k4 + " = " + k4 * g4 + "\t");
				g4++;
			}
			System.out.println();
			k4++;
		}
		System.out.println("============================");

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		int k5 = 1;
		while (k5 < 5) {
			int g5 = 1;
			while (g5 < 5) {
				System.out.print("0 ");
				g5++;
			}
			System.out.println();
			k5++;
		}
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		int k6 = 1;
		while (k6 < 5) {
			int g6 = 1;
			while (g6 < 5) {
				if (k6 == g6) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				g6++;
			}
			System.out.println();
			k6++;
		}
	}
}
