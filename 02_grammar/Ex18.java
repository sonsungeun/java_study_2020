
public class Ex18 {
	public static void main(String[] args) {
		// 삼항연산자(조건연산자)
		// - 형식 : 저장변수 = 조건식 ? 참일때 실행문장 : 거짓일때 실행문장
		// - 조건식에 들어가는 연산 : boolean형 ->  비교연산, 논리연산, boolean
		// - 저장변수, 참일때 실행결과, 거짓일때 실행결과 모두 같은 자료형이어야 한다.
		
		String res = true ? "합격 " : "불합격";
		System.out.println("결과 : " + res);
		
		// 저장변수, 참일때 실행결과, 거짓일때 실행결과 모두 같은 자료형
		//res = false ? 10 : "B";
		
		// 예외사항
		int point1 = true ? 10 : 20 ;
		long point2 = true ? 10 : 20 ;
		double point3 = true ? 10 : 24.7 ;
		
		// 평균이 90점 이상이면 'A', 아니면 'B'
		double avg = 87.6;
		int result =  (avg >= 90) ? 'A' : 'B';
		System.out.println("결과 : "+(char)(result));
				
	}
}
