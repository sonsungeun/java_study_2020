class Ex02{
	public static void main(String[] args){
		boolean res;		//선언
		res = true;		//데이터 저장
		System.out.println(res);	//출력

		boolean res1 = false;	//선언과 데이터 저장을 한번에
		System.out.println(res1);	//출력

		//선언만 하고 데이터를 저장하지 않았음 , 후에 출력하면?
		//boolean res2;
		//System.out.println(res2);	
		//결과 : variable res2 might not have been initialized-> 초기 값이 없어서 호출 할 수 없음.

		
	}
}