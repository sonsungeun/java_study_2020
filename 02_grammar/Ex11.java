class Ex11{
	public static void main(String[] args){
	//이름이 홍길동인 사람의 점수가 
	//국어 90, 영어 80, 수학 80점이다.
	//총점과 평균을 구하자.
	//출력은 이름, 총점, 평균만 출력하자.
	//(단, 평균은 소수점 첫째자리까지 구하자)
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int sum = kor + eng + math;
		double avg = (int)(sum/3.0*10)/10.0;
		System.out.println("이름 : " + name + ", 총점 : " + sum + ", 평균 : " + avg);


	//카페모카가 6500원이다.친구와 둘이서 15000을 내고 주문했다.
	//잔돈은 얼마 남았나?(단, 부가세 10%포함해서 계산하시오.)
//		int coffee = 6500;
//		int paid = 15000;
//		int vat = (int)(coffee*0.1);
		
//		int exchange = paid - (coffee + vat)*2;
//		System.out.println("잔돈은 "+exchange+"입니다.");
		
		String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su =2;
		int total = dan *su;
		int vat = (int)(total *0.1);
		int output = input-(total+vat);
		System.out.println("잔돈 : " + output);
	}
}