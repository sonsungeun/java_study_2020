package com.ict.edu;

import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용
//	 		 database, I/O, 네트워크에서 주로 사용된다.
//	try{
//		예외 발생 가능한 문장들;
//	} catch(예외객체 e){
//		예외 객체 처리 문장;
//	} catch(예외객체 e){
//		예외 객체 처리 문장;
//	} finally{
//		무조건 실행해야 하는 문장;
//	}
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int var = 50;
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
			return;
		} finally {
			System.out.println("반드시 수행하는 문장");
		}
		System.out.println("수고하셨습니다.");
	}
}
