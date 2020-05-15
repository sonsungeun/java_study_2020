class Ex05{
	public static void main(String[] args){
		//실수	: 소숫점이 있음
		//float < double
		//실수의 기본형은 double

		//float는 숫자 뒤에 *반드시* F, f 를 붙여야 한다.(생략하면 오류)

		//24가 정수이므로 float는 실수(float > int) 그러므로 저장할 수 있다.
			float su1 = 24;
			System.out.println(su1);
		
		//31.4에 F, f 를 붙여야 오류 발생하지 않음.
			float su2 = 31.4f;
			System.out.println(su2);

		//char c1는 float에 저장할 수 있다.
			char c1 = 97;
			System.out.println(c1);

			float su3 = c1;
			System.out.println(su3);

		//double은 byte, short, char, int, long, float 모두 받아서 저장할 수 있다.
			double su4 = 3.14;
			System.out.println(su4);

			double su5 = su3;
			System.out.println(su5);

			double su6 = c1;
			System.out.println(su6);

			
	}
}
