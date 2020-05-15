package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식1 :
		// 초기식
		// while(조건식){
		// 조건식이 참일때 실행 ;
		// 증감식;
		// }
		// while문 끝을 만나면 무조건 조건식으로 가라
		// 형식2 :
		// 초기식
		// while(true){
		// if(빠져나갈 조건) break;
		// 조건식이 참일때 실행 ;
		//
		// 증감식;
		// }

		// 0 ~ 10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n=========================");
		int k1 = 0;
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1 += 1;
		}
		System.out.println("\n=========================");

		k1 = 0;
		while (true) {
			if (k1 > 10)
				break;
			System.out.print(k1 + " ");
			k1 += 1;
		}
		System.out.println("\n=========================");
		// 0~10 출력하기
		int k2 = 0;
		while (k2 < 11) {
			System.out.print(k2 + " ");
			k2 += 1;
		}
		System.out.println("\n=========================");

		// 0~10까지 짝수만 출력 
		k2 = 0;
		while (k2 < 11) {
			if (k2 % 2 == 0) {
				System.out.print(k2 + " ");
			}
			k2 += 1;
		}
		System.out.println("\n=========================");

		// 0~10까지 홀수만 출력
		k2 = 0;
		while (k2 < 11) {
			if (k2 % 2 == 1) {
				System.out.print(k2 + " ");
			}
			k2 += 1;
		}
		System.out.println("\n=========================");
		// 0 ~ 50까지 7의 배수 출력
		k2 = 0;
		while (k2 < 51) {
			if (k2 % 7 == 0) {
				System.out.print(k2 + " ");
			}
			k2 += 1;
		}
		System.out.println("\n=========================");
		// a ~ g 출력
		char c1 = 'a';
		while (c1 <= 'g') {
			System.out.print(c1 + " ");
			c1 += 1;
		}
		System.out.println("\n=========================");
		// 5단 출력하기
		k2 = 1;
		System.out.println("구구단 : 5단");
		while (k2 < 10) {
			System.out.println("5 * " + k2 + " = " + 5 * k2);
			k2 += 1;
		}
		System.out.println("\n=========================");
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		String str = "0 0 0 0 ";
		k2 = 0;
		while (k2 < 4) {
			System.out.println(str);
			k2 += 1;
		}
		System.out.println("===================");
		str = "0 ";
		k2 = 1;
		while (k2 < 17) {
			System.out.print(str);
			if (k2 % 4 == 0) {
				System.out.println();
			}
			k2 += 1;
		}
		// 숙제
		// 0-10 누적합 (합계)
		k2 = 0;
		int sum1 = 0;
		while (k2 < 11) {
			sum1 += k2;
			k2++;
		}
		System.out.println("누적합 = " + sum1);
		System.out.println("===================");

		// 0-10 홀수의 합계,
		int k3 = 0;
		sum1 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 1) {
				sum1 += k3;
			}
			k3++;
		}
		System.out.println("홀수합 = " + sum1);
		System.out.println("===================");

		// 0-10 짝수의 합계,
		k3 = 0;
		sum1 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				sum1 += k3;
			}
			k3++;
		}
		System.out.println("짝수합 = " + sum1);
		System.out.println("===================");

		// 0-10 홀수, 짝수의 합계
		k3 = 0;
		sum1 = 0;
		int sum2 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 1) {
				sum1 += k3;
			} else if (k3 % 2 == 0) {
				sum2 += k3;
			}
			k3++;
		}
		System.out.println("홀수합 = " + sum1);
		System.out.println("짝수합 = " + sum2);
		System.out.println("===================");

		// 7! = (7*6*5*4*3*2*1) 구하기
		int k4 = 7;
		int fac = 1;
		while (k4 > 0) {
			fac *= k4;
			k4--;
		}
		System.out.println("7! = " + fac);
	}
}
