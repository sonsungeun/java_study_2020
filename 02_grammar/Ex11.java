class Ex11{
	public static void main(String[] args){
	//�̸��� ȫ�浿�� ����� ������ 
	//���� 90, ���� 80, ���� 80���̴�.
	//������ ����� ������.
	//����� �̸�, ����, ��ո� �������.
	//(��, ����� �Ҽ��� ù°�ڸ����� ������)
		String name = "ȫ�浿";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int sum = kor + eng + math;
		double avg = (int)(sum/3.0*10)/10.0;
		System.out.println("�̸� : " + name + ", ���� : " + sum + ", ��� : " + avg);


	//ī���ī�� 6500���̴�.ģ���� ���̼� 15000�� ���� �ֹ��ߴ�.
	//�ܵ��� �� ���ҳ�?(��, �ΰ��� 10%�����ؼ� ����Ͻÿ�.)
//		int coffee = 6500;
//		int paid = 15000;
//		int vat = (int)(coffee*0.1);
		
//		int exchange = paid - (coffee + vat)*2;
//		System.out.println("�ܵ��� "+exchange+"�Դϴ�.");
		
		String coff = "ī���ī";
		int input = 15000;
		int dan = 6500;
		int su =2;
		int total = dan *su;
		int vat = (int)(total *0.1);
		int output = input-(total+vat);
		System.out.println("�ܵ� : " + output);
	}
}