class Ex07{
	public static void main(String[] args){
		//수의 연산에 따른 자료형 변환
		//연산 후 무조건 큰 자료형으로 변경됨
		//예외) byte, short는 연산을 하면 무조건 int 이상의 자료형으로 변경
			byte su1 = 20;
			short su2 = 25;
			int su3 = 30;
			long su4 = 35;

			float su5 = 34.1f;
			double su6 = 247.12;	

		//*예외*byte(short) + byte = int
			int res1 = su1+su1;
			System.out.println(res1);
		//*예외*byte(short) + short = int
			int res2 = su2+su2;
			System.out.println(res2);
		//byte(short) + int = int
			
		//byte(short) + long = long
		//byte(short) + float = float
		//byte(short) + double = double

		//int + int = int
		//int + long = long		
		//int + float = float
		//int + double = double

		//long + long = long
		//long + float = float
		//long + double = double

		//float + float = float
		//float + double = double

		//double + double = double

		//소숫점 첫째자리까지 구하자
			double num1 = 83.5555;
			int num2 = (int)(num1 *10);
			double num3 = num2/10.0;	//num2나 10중 둘 중 하나 실수형으로 만들어서 결과값 실수형이 되도록 만들어주기~
			System.out.println(num3);


		//일의자리 절삭하기
			int num4 = 12758;
			int num5 = num4/10;
			int num6 = num5*10;
			System.out.println(num6);


		}
}