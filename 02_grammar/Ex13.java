class Ex13{
	public static void main(String[] args){
	//2시간 40분 30초는 몇 초일까요?

		int h = 2;		
		int m = 40;
		int s = 30;
		int result = 0;

		int hts = h*3600;
		int mts= m*60;

		result = hts+mts+s;

		System.out.println(h + "시간" + m + "분" + s + "초는 " + result + "초입니다."); 
	}
}