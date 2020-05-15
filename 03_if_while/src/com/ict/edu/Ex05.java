package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// for(�ʱ��; ���ǽ�; ������){
		// ���ǽ��� ���϶� ������ ����;
		// }
		// for���� ������ �ʱ�ĺ��� �����Ѵ�. ���ǽ����� �̵�
		// ���ǽ��� boolean��(boolean, �񱳿���, ������)
		// ���ǽ��� ���̸� for�� ���� ����� �����Ѵ�.
		// ���ǽ��� �����̸� for���� �������� �ʴ´�.
		// for���� ���� ������ ������ ���������� ����.
		// �������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ�
		// �ٽ� ���ǽ����� ����.

		// **JAVA RULE**�ڹٿ����� if��, switch��, for�� �ȿ� ���� ������ �ۿ��� ����� �� ����.**

		// �ȳ��ϼ��� ���� ����ϱ�
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("========================");

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		}
		System.out.println("========================");
		// 0~10 ����ϱ�
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("========================");
		// 0~10���� ¦���� ���
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 0~10���� Ȧ���� ���
		System.out.println("========================");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("========================");
//Bad coding-���ø� �˻��ϹǷ�	
//		for (int i = 0; i < 11; i += 2) {
//			System.out.println(i);
//		}
//		System.out.println("========================");

		// 0 ~ 50���� 7�� ��� ���
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				// ��� �� ���� ����
				System.out.println(i);
			}
		}

		// a ~ g = char�� ���ڶ� �Ȱ��� ���� ��
		for (char i = 'a'; i <= 'g'; i++) {
			// ������ ����ϱ�. "\t"�� tab�� �ǹ�
			System.out.print(i + "\t");
		}
		// "\n"�� ���� ����
		System.out.println("����\n�ٶ�");
		// �� �� ����
		System.out.println();
//		�������� �ʴ� �޼ҵ�
//		System.out.print();

		// 5�� ����ϱ�
		for (int i = 1; i < 10; i++) {
			int res = 5 * i;
			System.out.println("5 * " + i + " = " + res);
		}

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
		System.out.println("==============================");
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("==============================");
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		// ������ (�հ�)
		int sum = 0; // ���� ���� ����Ű�� ����
		for (int i = 0; i < 11; i++) {
			sum += i; // i �� ������
		}
		System.out.println("������ : " + sum);
		// 0-10 Ȧ���� �հ�,
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd += i;
			}
		}
		System.out.println("Ȧ�� �� : " + odd);
		// 0-10 ¦���� �հ�,
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println("¦�� �� : " + even);
		// 0-10 Ȧ��, ¦���� �հ�
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd += i;
			} else if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println("Ȧ�� �� : " + odd);
		System.out.println("¦�� �� : " + even);
		// 7! = (7*6*5*4*3*2*1) ���ϱ�
		sum = 1;
		for (int i = 1; i < 8; i++) {
			sum *= i;
		}
		System.out.println("7! = "+sum);
	}
}
