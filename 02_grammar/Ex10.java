class Ex10{
	public static void main(String[] args){
	//증감 연산자 : 1 증가 또는 1 감소
	//char, 정수형, 실수형에 사용 가능
	// ++ 변수 : 현재값을 먼저 1 증가하고 나머지 실행
	// 변수 ++ : 현재값으로 연산 후 나중에 1 증가
		int su1 = 10;
		int su2 = 10;

		System.out.println(++ su1);
		System.out.println(su2 ++);
		System.out.println(su1);
		System.out.println(su2);	
	}
}