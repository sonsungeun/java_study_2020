class Ex04{
	public static void main(String[] args){
		//���� : ������(�Ҽ����� ����) < �Ǽ���(�Ҽ����� ����)
		//������ : byte < short < int < long
		//�������� �⺻�� int�̴�.

		//�Ǽ��� : float < double
		//�Ǽ����� �⺻�� double�̴�.

		//byte : �������� ���� ���� ����( -128 ~ 127 ���� ���ڸ� ���� ���� )
			byte b1 = 127;
			System.out.println(b1);

		//������ ����� ����ȴ�.
			byte b2 = 15+20;
			System.out.println(b2);
		
		//short : -32768 ~ 32767������ ���� ����
			short s1 = -32768;
			System.out.println(s1);

			short s2 = 32767;
			System.out.println(s2); 

		//int�� long�� ���� ������ �ܿ� �ʿ� ����.
		//������ �Ϲ����� ������ int ��� �� ����
		//���� ū ������ ����� �� long�� ���
			int i1 = 247;
			System.out.println(i1);
			int i2 = 7777777;
			System.out.println(i2);

		//long : int���� �� ���� ������ ������ ����
		//	�⺻������ ���� �ڿ� L �Ǵ� l �� ���δ�.(��������)
			long num1 = 124L;
			System.out.println(num1);
			long num2 = 124;		// = ^�ڵ�����ȯ^(=promotion, ���� �ڷ����� ū �ڷ����� ����Ǵ� ���� ������ ���� �ʴ´�.)
			System.out.println(num2);


		//���� i1�� long�� num3�� ����
			long num3 = i1;
			System.out.println(num3);

		//short s1�� long num4�� ����
			long num4 = s1;
			System.out.println(num4);

		//short s1�� int i3�� ����
			int i3 = s1;
			System.out.println(i3);
		
		//char c1�� int i4�� ���� // *char�� int �ȿ� ���� �� �ִ�.*
			char c1 = '��';
			int i4 = c1;
			System.out.println(i4);

		
	}
}