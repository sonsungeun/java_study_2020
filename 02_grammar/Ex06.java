class Ex06{
	public static void main(String[] args){
		//숫자들의 크기에 따른 저장 원리
		//byte < short < char < int < long < float < double

		//1. 자기보다 큰 자료형으로는 자유롭게 저장할 수 있다.(자동형변환,promotion)
			int s1 = 'A';
			System.out.println(s1);

			long s2 = 241;
			System.out.println(s2);

			float s3 = s2;
			System.out.println(s3);

			double s4 = s3;
			System.out.println(s4);

			
		//2. 자기보다 작은 자료형으로 저장할 때는 오류 발생
		//  오류발생을 방지하기 위해서 강제로 자료형을 변경한다.(강제형변환, 디모션, casting)
		//  강제로 형변환시 원래 데이터가 손실될 수도(변경될 수도) 있다.
		//  강제로 형변환하는 방법
		//    = 을 기준으로 무조건 왼쪽 자료형으로 맞춰야 한다.
		//  ***  자료형 이름 = (좌변자료형)(데이터);  ***
			byte b1 = (byte)(129);
			System.out.println(b1);			//129가 byte형이 표시할 수 있는 범위 내에 없기 때문에 데이터 값 변환
								//고급 -> 참조자료형에선 대부분 디모션 필요
			int b2 = 110;
			byte b3 = (byte)(b2);
			System.out.println(b3);			//byte범위 내에 있는 값이므로 그대로 출력
	
			float b4 = (float)(34.125);
			System.out.println(b4);	

		//정수
			int b5 = (int)(87.12);
			System.out.println(b5);

		//소숫점 첫째자리까지 구하자.
			double b6 = 87.12;
			int b7 = (int)(b6*10);
			double b8 = ((double)(b7)) / 10;
			System.out.println(b8);

		//3.char 형변환
			char c1 = 'a'+2 ;
			System.out.println(c1);
			char c2 = 97+2;
			System.out.println(c2);
			int b9 = c2;
			System.out.println(b9);
	}
}