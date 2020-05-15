class Ex04{
	public static void main(String[] args){
		//숫자 : 정수형(소숫점이 없음) < 실수형(소숫점이 있음)
		//정수형 : byte < short < int < long
		//정수형의 기본은 int이다.

		//실수형 : float < double
		//실수형의 기본은 double이다.

		//byte : 정수형중 가장 작은 단위( -128 ~ 127 사이 숫자만 저장 가능 )
			byte b1 = 127;
			System.out.println(b1);

		//계산식은 결과만 저장된다.
			byte b2 = 15+20;
			System.out.println(b2);
		
		//short : -32768 ~ 32767사이의 값만 저장
			short s1 = -32768;
			System.out.println(s1);

			short s2 = 32767;
			System.out.println(s2); 

		//int와 long은 숫자 범위를 외울 필요 없다.
		//앞으로 일반적인 정수는 int 사용 할 것임
		//아주 큰 정수를 사용할 때 long형 사용
			int i1 = 247;
			System.out.println(i1);
			int i2 = 7777777;
			System.out.println(i2);

		//long : int보다 더 넓은 범위를 가지고 있음
		//	기본적으로 숫자 뒤에 L 또는 l 을 붙인다.(생략가능)
			long num1 = 124L;
			System.out.println(num1);
			long num2 = 124;		// = ^자동형변환^(=promotion, 작은 자료형이 큰 자료형에 저장되는 것은 오류가 나지 않는다.)
			System.out.println(num2);


		//정수 i1를 long형 num3에 저장
			long num3 = i1;
			System.out.println(num3);

		//short s1를 long num4에 저장
			long num4 = s1;
			System.out.println(num4);

		//short s1를 int i3에 저장
			int i3 = s1;
			System.out.println(i3);
		
		//char c1를 int i4에 저장 // *char를 int 안에 담을 수 있다.*
			char c1 = '가';
			int i4 = c1;
			System.out.println(i4);

		
	}
}