package com.ict.edu;

public class Ex06 {
	public static void main(String[] args) {
		// ���� for�� : for�� �ȿ� �ٸ� for���� �����ϴ� ��
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ",j = " + j);
			}
		}
		// ������ ����ϱ�
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "��");
			for (int j = 1; j < 10; j++) {
				int res = i * j;
				System.out.println(i + " * " + j + " = " + res);
			}
		}
		System.out.println("===================================");

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int res = i * j;
				System.out.print(i + " * " + j + " = " + res + "\t");
			}
			System.out.println();
		}
		System.out.println("===================================");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int res = i * j;
				System.out.print(j + " * " + i + " = " + res + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("====================================");

		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == i) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("====================================");

	}
}
