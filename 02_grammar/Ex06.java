class Ex06{
	public static void main(String[] args){
		//���ڵ��� ũ�⿡ ���� ���� ����
		//byte < short < char < int < long < float < double

		//1. �ڱ⺸�� ū �ڷ������δ� �����Ӱ� ������ �� �ִ�.(�ڵ�����ȯ,promotion)
			int s1 = 'A';
			System.out.println(s1);

			long s2 = 241;
			System.out.println(s2);

			float s3 = s2;
			System.out.println(s3);

			double s4 = s3;
			System.out.println(s4);

			
		//2. �ڱ⺸�� ���� �ڷ������� ������ ���� ���� �߻�
		//  �����߻��� �����ϱ� ���ؼ� ������ �ڷ����� �����Ѵ�.(��������ȯ, ����, casting)
		//  ������ ����ȯ�� ���� �����Ͱ� �սǵ� ����(����� ����) �ִ�.
		//  ������ ����ȯ�ϴ� ���
		//    = �� �������� ������ ���� �ڷ������� ����� �Ѵ�.
		//  ***  �ڷ��� �̸� = (�º��ڷ���)(������);  ***
			byte b1 = (byte)(129);
			System.out.println(b1);			//129�� byte���� ǥ���� �� �ִ� ���� ���� ���� ������ ������ �� ��ȯ
								//��� -> �����ڷ������� ��κ� ���� �ʿ�
			int b2 = 110;
			byte b3 = (byte)(b2);
			System.out.println(b3);			//byte���� ���� �ִ� ���̹Ƿ� �״�� ���
	
			float b4 = (float)(34.125);
			System.out.println(b4);	

		//����
			int b5 = (int)(87.12);
			System.out.println(b5);

		//�Ҽ��� ù°�ڸ����� ������.
			double b6 = 87.12;
			int b7 = (int)(b6*10);
			double b8 = ((double)(b7)) / 10;
			System.out.println(b8);

		//3.char ����ȯ
			char c1 = 'a'+2 ;
			System.out.println(c1);
			char c2 = 97+2;
			System.out.println(c2);
			int b9 = c2;
			System.out.println(b9);
	}
}