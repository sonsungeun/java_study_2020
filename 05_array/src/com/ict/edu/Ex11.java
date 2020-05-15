package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
//입력받기
		for (int i = 0; i < 5; i++) {
			System.out.print("번호 : ");
			int no = sc.nextInt();
			int sum = 0;
			System.out.print("국어 점수 : ");
			sum += sc.nextInt();
			System.out.print("수학 점수 : ");
			sum += sc.nextInt();
			System.out.print("영어 점수 : ");
			sum += sc.nextInt();
			int avg = sum / 3;
			int hak = 0;
			if (avg >= 90) {
				hak = 'A';
			} else if (avg >= 80) {
				hak = 'B';
			} else if (avg >= 70) {
				hak = 'C';
			} else {
				hak = 'F';
			}
			int[] tmp = { no, sum, avg, hak, 1 };
			arr[i] = tmp;
			sum = 0;
			System.out.println("================================");
		}
//순위구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		// 등수로정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					int[] tmp = new int[5];
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

//출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j == 3) {
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
