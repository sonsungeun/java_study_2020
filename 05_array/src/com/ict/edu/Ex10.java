package com.ict.edu;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		// 번호, 총점, 평균, 학점, 순위
		int[][] arr = new int[5][5];
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 95, 'A', 1 };
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		// 정렬하기
		int[][] arr2 = new int[5][5];
		int[] p11 = { 1, 270, 90, 'A', 1 };
		int[] p22 = { 2, 210, 70, 'C', 1 };
		int[] p33 = { 3, 180, 60, 'F', 1 };
		int[] p44 = { 4, 300, 100, 'A', 1 };
		int[] p55 = { 5, 285, 95, 'A', 1 };
		arr2[0] = p11;
		arr2[1] = p22;
		arr2[2] = p33;
		arr2[3] = p44;
		arr2[4] = p55;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[i][1] < arr2[j][1]) {
					arr2[i][4]++;
				}
			}
		}
		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i][4] > arr2[j][4]) {
					int[] tmp = { 0, 0, 0, 0, 0 };
					tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		// 출력하기
		System.out.println("순위 구하기 >>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j == 3) {
					System.out.print((char) (arr[i][j]) + "\t");

				} else {
					System.out.print(arr[i][j] + "\t");

				}
			}
			System.out.println();
		}
		System.out.println("등수로 정렬 >>");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (j == 3) {
					System.out.print((char) (arr2[i][j]) + "\t");

				} else {
					System.out.print(arr2[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}