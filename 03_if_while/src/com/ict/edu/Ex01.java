package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if : 조건식이 참일때만 실행, 거짓일때는 if문 무시
		// 조건식 : boolean, 비교연산, 논리연산
		// 형식 : if(조건식){
		// 조건식이 참일때 실행 문장;
		// 조건식이 참일때 실행 문장;
		// }
		// 단, 실행문장이 한 줄 일 때는 { } 생략 가능

		// int k1 이 60 이상이면 합격,
		int k1 = 59;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);
		System.out.println("수고하셨습니다.");

		// int k2 이 60 이상이면 합격, 60미만은 불합격
		int k2 = 59;
		str = "초기값";
		if (k2 >= 60) {
			str = "합격";
		}
		if (k2 < 60) {
			str = "불합격";
		}
		System.out.println("결과 : " + str);

		// int k3 이 60 이상이면 합격, 60미만은 불합격
		int k3 = 59;
		str = "불합격";
		if (k3 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);

		// 홀수 짝수 판별
		int k4 = 7;
		str = "홀수";
		if (k4%2 ==0) {
			str = "짝수";		
		}
		System.out.println("결과 : "+str);
		// 대문자, 소문자 판별
		char k5 = 'G';
		str = "대문자";
		if (k5>='a' && k5<='z') {
			str = "소문자";
		}
		System.out.println("결과 : "+str);
		// 1또는 3이면 남자, 아니면 여자
		int k6 = 1;
		str = "여자";
		if (k6 ==1 || k6 ==3) {
			str = "남자";
		}

		System.out.println("결과 : "+str);
		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int pay = 0;
		int dan = 8590;
		pay = time * dan;
		if (time > 8) {
			pay = (int)((time-8)*1.5*dan + 8*dan);
		}
		System.out.println("오늘 임금 : "+pay);
		// 두 수 중 큰 값을 출력하시오.
		int k7 = 10;
		int k8 = 15;
		
		int result = k7;
		if (k8>k7) {
			result = k8;
		}
		System.out.println("두 수 중 큰 값은 "+result+"입니다.");
	}
}
