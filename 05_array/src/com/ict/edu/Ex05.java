package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 80, 95, 85, 70, 100 };
		int[] math = { 100, 100, 100, 100, 100 };

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
		for (int i = 0; i < rank.length; i++) {
			System.out.println(name[i]+"의 총점 : "+sum[i]+" \t평균 : "+avg[i]+" \t학점 : "+hak[i]+" \t** "+rank[i]+"등 **");
		}
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
