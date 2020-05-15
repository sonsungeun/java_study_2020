class Ex03{
	public static void main(String[] args){
	//문자를 변수에 저장하기
	//char의 데이터 값은 0-65535의 숫자 값이다.(영어,한글,일어,한자 다 표현할 수 있도록 숫자로 값 매겨놓음)
	//문자를 사용하기 위해서는 반드시 ' '(홑따옴표)를 사용한다.
	//문자란 한 글자를 의미한다. (char ch != 'ab';)


	//1. 선언과 데이터를 한번에 하자(문자를 집어넣어도 숫자로 저장되는 것임,쓰기 편하게 그냥 문자로 쓰는 것)
		char ch1 = 'a'; 	// == char ch1 = 97; 로 저장 됨
	//2.출력
		System.out.println(ch1);

		char ch2 = 65;
		System.out.println(ch2);

		char ch3 = '가';
		System.out.println(ch3);

		char ch4 = '1';
		System.out.println(ch4);

		char ch5 = '\u0042';
		System.out.println(ch5);

		char ch6 = '\uAC00';
		System.out.println(ch6);

		char ch7 = '\uB098';
		System.out.println(ch7);
	}
}