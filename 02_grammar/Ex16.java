class Ex16{
	public static void main(String[] args){
	// 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
	// 논리연산자의 대상(들어오는 정보) : boolean형, 비교연산, 논리연산
	// 논리연산의 결과는 boolean형. 즉, 조건식에 사용된다.

	// OR ( ||, 논리합 ) : 주어진 조건 중 하나라도 true 일 때 결과는 true
	//			주어진 조건 중 true를 만나면 결과는 true
	//			true를 만나면 이후 연산을 하지 않음

		int su1 = 10;
		int su2 = 7;
		boolean result = false;

		result = (su1 >= 7) || (su2 > 5); 	// true = true || true
		System.out.println("결과 : " + result);	

		result = (su1 >= 7) || (su2 <= 5);	// true = true || false 
		System.out.println("결과 : " + result);	

		result = (su1 <= 7) || (su2 > 5); 	// true = false || true
		System.out.println("결과 : " + result);	

		result = (su1 <= 7) || (su2 <= 5); 	// false = false || false
		System.out.println("결과 : " + result);	
		System.out.println("============================================================");

	// OR은 앞 조건이 true이면 뒤 조건을 연산하지 않는다.
		result = ((su1 = su1+2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);	
		System.out.println("su1 : " + su1);	
		System.out.println("su2 : " + su2);
		System.out.println("============================================================");


	//char c1이 소문자인가?
		char c1 = 'G';                   
		char c2 = 'a';
		char c3 = 'z';
		result = (c1 >= c2) && (c1 <= c3);
		System.out.println("결과 : "+result);

	// NOT( !, 논리부정) : 주어진 논리값을 반대로 출력한다.
	//			true => false, false => true;
		result = true;
		System.out.println(result);
		System.out.println(!result);
		System.out.println(!!result);
		System.out.println(!!!result);
	}
}