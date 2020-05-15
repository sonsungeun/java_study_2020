package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점 ,순위를 구하고 정렬하자
		// 순위와 정렬은 main에서 구함
		Scanner sc = new Scanner(System.in);

		// 한사람의 정보를 가지고 있는 클래스가 Ex09이다.
		// 5명의 정보를 가질 수 있는 Ex09[]배열을 만들자
		Ex10[] arr = new Ex10[5];

		for (int i = 0; i < 5; i++) {
			Ex10 person = new Ex10();
			System.out.print("이름 : ");
			person.setName(sc.next());
			System.out.print("국어성적 : ");
			int kor = sc.nextInt();
			System.out.print("영어성적 : ");
			int eng = sc.nextInt();
			System.out.print("수학성적 : ");
			int math = sc.nextInt();
			// 합계
			// 지금은 Ex10클래스가 처리와 저장을 같이 하지만
			// 처리와 저장을 별도로 할때 많이 사용되는 기법
			int sum = person.s_sum(kor, eng, math);
			person.setSum(sum);
			// 평균
			double avg = person.s_avg();
			person.setAvg(avg);
			// 학점
			String hak = person.s_hak();
			person.setHak(hak);
			arr[i] = person;
		}
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// 정렬
		// 임시저장 클래스
		Ex10 tmp = new Ex10();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t" + arr[i].getSum() + "\t" + arr[i].getAvg() + "\t" + arr[i].getHak()
					+ "\t" + arr[i].getRank());
			System.out.println();
		}

	}

}
