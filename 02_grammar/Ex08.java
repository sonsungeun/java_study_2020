class Ex08{
	public static void main(String[] args){
	//���� �ڷ��� : Ŭ������ �ڷ������� ����Ѵ�.
	//String Ŭ���� : ���ڿ��� ó���ϴ� ����� ������ �ִ� Ŭ����
	//String Ŭ������ �⺻�ڷ����� �ƴϴ�.
	//String Ŭ������ �ڷ���ó�� ����ϱ� ���ؼ��� �ݵ�� " "(�ֵ���ǥ)�� ����ؾ� �Ѵ�.

		String str = "Hello";
		System.out.println(str);

	//String + ���� : String���� +�� ������ �ƴϴ�. ���� �������̴�.
	//		  + ������ �ϸ� ����� ������ String�̴�.
		str = "10000";
		int su = 10000;

		System.out.println(str+10);
		System.out.println(su+10);
		System.out.println(str+su);	

		int su1 = 20;
		int su2 = 4;
		int res = su1+su2;				//�׻� ���� ���� �����ϰ�, ���
		System.out.println(su1+su2);
		System.out.println("��� : "+(su1+su2));	//��ȣġ�� ����� �Ǳ� �ϳ�...
		System.out.println("��� : "+res);		//�������ΰ��� �̰�~
	
	}
}