class Ex12{
	public static void main(String[] args){
	//3989초는 몇시간 몇분 몇초인가?
		int time = 3989;
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = (time % 3600) % 60;

		System.out.println("시간변환 ; " + time +"초 = " + hour+"시간 "+min+"분 "+sec+"초");

//////////////////////////////////////////////////
	//answer
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; //나머지

		//시간 구하기 = 몫(3600을 나눈 몫이 시간)
		h = time / 3600;
		res = time % 3600;

		//분 구하기 = 몫
		m = res / 60;

		//초 구하기 = 나머지
		s = res % 60;

		//출력하기
		System.out.println(time+"초는 "+h+"시 "+m+"분 "+s+"초");
	}
}