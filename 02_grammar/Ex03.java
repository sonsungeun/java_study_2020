class Ex03{
	public static void main(String[] args){
	//���ڸ� ������ �����ϱ�
	//char�� ������ ���� 0-65535�� ���� ���̴�.(����,�ѱ�,�Ͼ�,���� �� ǥ���� �� �ֵ��� ���ڷ� �� �Űܳ���)
	//���ڸ� ����ϱ� ���ؼ��� �ݵ�� ' '(Ȭ����ǥ)�� ����Ѵ�.
	//���ڶ� �� ���ڸ� �ǹ��Ѵ�. (char ch != 'ab';)


	//1. ����� �����͸� �ѹ��� ����(���ڸ� ����־ ���ڷ� ����Ǵ� ����,���� ���ϰ� �׳� ���ڷ� ���� ��)
		char ch1 = 'a'; 	// == char ch1 = 97; �� ���� ��
	//2.���
		System.out.println(ch1);

		char ch2 = 65;
		System.out.println(ch2);

		char ch3 = '��';
		System.out.println(ch3);

		char ch4 = '1';
		System.out.println(ch4);

		char ch5 = '\u0042';
		System.out.println(ch5);

		char ch6 = '\uAC00';
		System.out.println(ch6);

		char ch7 = '\uB098';
		System.out.println(ch7);
	}
}