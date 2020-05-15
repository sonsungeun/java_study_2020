package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] name = new String[5];
	int[] kor = new int[5];
	int[] eng = new int[5];
	int[] math = new int[5];
	int k =0;
	do {
		System.out.print((k+1)+"번째 입력입니다.\n이름 : ");
		name[k] = sc.next();
		System.out.print("국어점수 : ");
		kor[k]=sc.nextInt();
		System.out.print("영어점수 : ");
		eng[k]=sc.nextInt();
		System.out.print("수학점수 : ");
		math[k]=sc.nextInt();
		k++;
	} while (k<name.length);
	
	int[] sum = new int[5];
	double[] avg = new double[5];
	String[] hak = new String[5];
	int[] rank = { 1, 1, 1, 1, 1 };

	// 총점, 평균, 학점
	for (int i = 0; i < sum.length; i++) {
		sum[i] = kor[i] + eng[i] + math[i];
	}
	for (int i = 0; i < avg.length; i++) {
		avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
	}
	for (int i = 0; i < hak.length; i++) {
		if (avg[i] >= 90) {
			hak[i] = "A학점";
		} else if (avg[i] >= 80) {
			hak[i] = "B학점";

		} else if (avg[i] >= 70) {
			hak[i] = "C학점";

		} else {
			hak[i] = "F학점";
		}
	}
	// rank
	for (int i = 0; i < sum.length; i++) {
		for (int j = 0; j < sum.length; j++) {
			if (sum[i]<sum[j]) {
				rank[i]++;
			}
		}
	}
	// 출력
	System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
	for (int i = 0; i < rank.length; i++) {
		System.out.print(name[i]+"\t");
		System.out.print(sum[i]+"\t");
		System.out.print(avg[i]+"\t");
		System.out.print(hak[i]+"\t");
		System.out.println(rank[i]);
	}
}
}
