package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
// 다중 catch문 : try문 안에 예외발생이 여러개 될 수 있는 경우
// 주의사항 : Exception 사용할 때는 반드시 아래쪽 catch문에 사용

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// InputMismatchException
		// ArithmeticException

		/*
		 * try { int var = 50; System.out.print("정수입력 : "); int su = sc.nextInt();
		 * System.out.println("정답 : " + (var / su));
		 * 
		 * } catch (InputMismatchException e1) { System.out.println("정수만 입력해주세요");
		 * }catch (ArithmeticException e2) {System.out.println("0으로 나눌 수 없습니다."); }
		 */
		try {
			int var = 50;
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
		}

		System.out.println("수고하셨습니다.");
	}
}
