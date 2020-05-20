package com.ict.edu;

// 예외처리 : Exception(), try ~ catch ~
//	   목적 : 비정상적인 종료를 정상적인 종료로 유도
//			  예외 발생시 예외에 대한 처리를 해준다.
//		try{
//			예외가 발생할 수 있는 문장;
//			예외가 발생할 수 있는 문장;
//			예외가 발생할 수 있는 문장;
//			예외가 발생할 수 있는 문장;
//		}catch(예외발생 객체 e){
//			예외 발생시 처리하는 문장;
//		}
public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = { 10, 20, 30 };
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}

		} catch (Exception e) {
			System.out.println("예외발생");
		}
		System.out.println("수고하셨습니다.");
	}
}
