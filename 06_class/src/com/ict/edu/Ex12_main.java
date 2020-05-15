package com.ict.edu;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점 ,순위를 구하고 정렬하자
		// 순위와 정렬은 main에서 구함
		Scanner sc = new Scanner(System.in);

		// 한사람의 정보를 가지고 있는 클래스가 Ex12이다.
		// 5명의 정보를 가질 수 있는 Ex12[]배열을 만들자
		Ex12[] arr = new Ex12[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어성적 : ");
			int kor = sc.nextInt();
			System.out.print("영어성적 : ");
			int eng = sc.nextInt();
			System.out.print("수학성적 : ");
			int math = sc.nextInt();
			// 총점
			int sum =kor+ eng+ math;
			// 평균
			double avg = (int) (sum / 3.0 * 10) / 10.0;
			// 학점
			String hak = "";
			if (avg >= 90) {
				hak = "A";
			} else if (avg >= 80) {
				hak = "B";
			} else if (avg >= 70) {
				hak = "C";
			} else {
				hak = "F";
			}

			Ex12 person = new Ex12(name, sum, avg, hak, 1);
			arr[i] = person;
		}
		// 순위 구하기
		for (

				int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// 정렬
		// 임시저장 클래스
		Ex12 tmp = new Ex12();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t" + arr[i].getSum() + "\t" + arr[i].getAvg() + "\t" + arr[i].getHak()
					+ "\t" + arr[i].getRank());
			System.out.println();
		}

	}

}
