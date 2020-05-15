package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식 : if(조건식){
		//			조건식이 참일때 실행 문장;
		//			조건식이 참일때 실행 문장;
		//		  }else{
		//			조건식이 거짓일때 실행 문장;
		//			조건식이 거짓일때 실행 문장;
		//		  }
		
		// int k1 이 60 이상이면 합격, 나머지 불합격
		int k1 = 78;
		String str = "초기값";
		if (k1>=60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println("결과 : "+str);
		// 홀수 짝수 판별
		int k2 = 8;
		if (k2 %2==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		System.out.println("결과 : "+str);
		// 대문자, 소문자 판별
		char c1 = 'a';
		if (c1>='a'&&c1<='z') {
			str = "소문자";
		}else {
			str = "대문자";
		}
		System.out.println("결과 : "+str);
		// 1또는 3이면 남자, 아니면 여자
		int k3 = 4;
		if (k3 ==1 || k3 ==3) {
			str = "남자";
		}else {
			str = "여자";
		}
		System.out.println("결과 : "+str);
		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int pay = 0;
		int dan = 8590;
		if (time > 8) {
			pay = (int)((time-8)*1.5*dan) + 8*dan;
		}else {
			pay = time *dan;
		}
		System.out.println("받아야 할 돈은 "+pay+"원입니다.");
		// 두 수 중 큰 값을 출력하시오.
		int k4 = 11;
		int k5 = 13;
		int res = 0;
		if (k4 > k5) {
			res = k4;
		}else {
			res = k5;
		}
		System.out.println("더 큰 값은 "+res+"입니다.");
	}
}