package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		// ���� : if(���ǽ�){
		//			���ǽ��� ���϶� ���� ����;
		//			���ǽ��� ���϶� ���� ����;
		//		  }else{
		//			���ǽ��� �����϶� ���� ����;
		//			���ǽ��� �����϶� ���� ����;
		//		  }
		
		// int k1 �� 60 �̻��̸� �հ�, ������ ���հ�
		int k1 = 78;
		String str = "�ʱⰪ";
		if (k1>=60) {
			str = "�հ�";
		}else {
			str = "���հ�";
		}
		System.out.println("��� : "+str);
		// Ȧ�� ¦�� �Ǻ�
		int k2 = 8;
		if (k2 %2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		System.out.println("��� : "+str);
		// �빮��, �ҹ��� �Ǻ�
		char c1 = 'a';
		if (c1>='a'&&c1<='z') {
			str = "�ҹ���";
		}else {
			str = "�빮��";
		}
		System.out.println("��� : "+str);
		// 1�Ǵ� 3�̸� ����, �ƴϸ� ����
		int k3 = 4;
		if (k3 ==1 || k3 ==3) {
			str = "����";
		}else {
			str = "����";
		}
		System.out.println("��� : "+str);
		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?
		int time = 10;
		int pay = 0;
		int dan = 8590;
		if (time > 8) {
			pay = (int)((time-8)*1.5*dan) + 8*dan;
		}else {
			pay = time *dan;
		}
		System.out.println("�޾ƾ� �� ���� "+pay+"���Դϴ�.");
		// �� �� �� ū ���� ����Ͻÿ�.
		int k4 = 11;
		int k5 = 13;
		int res = 0;
		if (k4 > k5) {
			res = k4;
		}else {
			res = k5;
		}
		System.out.println("�� ū ���� "+res+"�Դϴ�.");
	}
}