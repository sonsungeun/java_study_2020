class Ex13{
	public static void main(String[] args){
	//2�ð� 40�� 30�ʴ� �� ���ϱ��?

		int h = 2;		
		int m = 40;
		int s = 30;
		int result = 0;

		int hts = h*3600;
		int mts= m*60;

		result = hts+mts+s;

		System.out.println(h + "�ð�" + m + "��" + s + "�ʴ� " + result + "���Դϴ�."); 
	}
}