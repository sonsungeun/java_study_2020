class Ex15{
	public static void main(String[] args){
	// �������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
	// ���������� ���(������ ����) : boolean��, �񱳿���, ������
	// �������� ����� boolean��. ��, ���ǽĿ� ���ȴ�.

	// AND ( &&, ���� ) : �־��� ������ ��� true�϶� ����� true
	//			�־��� ���ǵ� �� false�� ������ ����� false
	//			false�� ������ ���� ������ ���� ����
	//			'a >= 10 && a <= 20'�� �ǹ̴� a�� 10���� 20������ **������ �ǹ�**�Ѵ�.

		int su1 = 10;
		int su2 = 7;
		boolean result = false;
		result = (su1 >= 7) && (su2 > 5); 	// true = true && true
		System.out.println("��� : " + result);	

		result = (su1 >= 7) && (su2 <= 5);	// false = true && false 
		System.out.println("��� : " + result);	

		result = (su1 <= 7) && (su2 > 5); 	// false = false && true
		System.out.println("��� : " + result);	

		result = (su1 <= 7) && (su2 <= 5); 	// false = false && false
		System.out.println("��� : " + result);	
		System.out.println("============================================================");

		result = ((su1 = su1+2) > su2) && (su1 == (su2 = su2 + 5));
		System.out.println("��� : " + result);	
		System.out.println("su1 : " + su1);	
		System.out.println("su2 : " + su2);
		System.out.println("============================================================");

	//AND�� false�� ������ ����� false�̰�, �� ������ �������� �ʴ´�.
		result = ((su1 = su1+2) < su2) && (su1 == (su2 = su2 + 5));
		System.out.println("��� : " + result);	
		System.out.println("su1 : " + su1);	
		System.out.println("su2 : " + su2);

		su1 = 35;
	//su1�� ���� 20���� 30 ������ �� �̳�?
		result = (su1 >= 20) && (su1 <= 30);
		System.out.println("��� : "+result);

	//char c1�� �ҹ����ΰ�?
		char c1 = 'G';
		char c2 = 'a';
		char c3 = 'z';
		result = (c1 >= c2) && (c1 <= c3);
		System.out.println("��� : "+result);

		
	}
}