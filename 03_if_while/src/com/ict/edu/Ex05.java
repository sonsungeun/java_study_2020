package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for(초기식; 조건식; 증감식){
		// 조건식이 참일때 실행할 문장;
		// }
		// for문은 무조건 초기식부터 시작한다. 조건식으로 이동
		// 조건식은 boolean형(boolean, 비교연산, 논리연산)
		// 조건식이 참이면 for문 안쪽 블록을 실행한다.
		// 조건식이 거짓이면 for문은 실행하지 않는다.
		// for문의 끝을 만나면 무조건 증감식으로 간다.
		// 증감식은 초기식을 증가하거나 감소시키는 역할을 하고
		// 다시 조건식으로 간다.

		// **JAVA RULE**자바에서는 if문, switch문, for문 안에 만든 변수는 밖에서 사용할 수 없다.**

		// 안녕하세요 열번 출력하기
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("========================");

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		}
		System.out.println("========================");
		// 0~10 출력하기
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("========================");
		// 0~10까지 짝수만 출력
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 0~10까지 홀수만 출력
		System.out.println("========================");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("========================");
//Bad coding-샘플만 검사하므로	
//		for (int i = 0; i < 11; i += 2) {
//			System.out.println(i);
//		}
//		System.out.println("========================");

		// 0 ~ 50까지 7의 배수 출력
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				// 출력 후 한줄 띄우기
				System.out.println(i);
			}
		}

		// a ~ g = char도 숫자랑 똑같이 쓰면 됨
		for (char i = 'a'; i <= 'g'; i++) {
			// 옆으로 출력하기. "\t"는 tab을 의미
			System.out.print(i + "\t");
		}
		// "\n"는 한줄 띄우기
		System.out.println("가나\n다라");
		// 한 줄 띄우기
		System.out.println();
//		존재하지 않는 메소드
//		System.out.print();

		// 5단 출력하기
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
		// 누적합 (합계)
		int sum = 0; // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum += i; // i 의 누적합
		}
		System.out.println("누적합 : " + sum);
		// 0-10 홀수의 합계,
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd += i;
			}
		}
		System.out.println("홀수 합 : " + odd);
		// 0-10 짝수의 합계,
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println("짝수 합 : " + even);
		// 0-10 홀수, 짝수의 합계
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd += i;
			} else if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println("홀수 합 : " + odd);
		System.out.println("짝수 합 : " + even);
		// 7! = (7*6*5*4*3*2*1) 구하기
		sum = 1;
		for (int i = 1; i < 8; i++) {
			sum *= i;
		}
		System.out.println("7! = "+sum);
	}
}
