
public class Ex19 {
	public static void main(String[] args) {
		// ���׿����� ������
		
		// int k1�� Ȧ������ ¦������ �Ǻ�����
		int k1 = 7;
		String result = (k1%2 == 1)?"Ȧ��":"¦��";
		System.out.println("k1�� "+result+"�Դϴ�.");
		
		// int k2�� 60�̻��̸� �հ�, �ƴϸ� ���հ� �Ǻ�����
		int k2 = 76;
		String result2 = (k2 >= 60) ? "�հ�" : "���հ�";
		System.out.println("k2�� "+result2+"�Դϴ�.");
		
		// char k3 = �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'H';
		String result3 = ((k3>='A')&&(k3<='Z'))?"�빮��":"�빮�ھƴ�";
		System.out.println("k3�� "+result3+"�Դϴ�.");
		
		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?
		int h = 10;
		double payment = h > 8? (8*8590+(h-8)*8590*1.5):(h*8590);
		System.out.println("�޾ƾ� �� ���� "+(int)(payment)+"���Դϴ�.");
	}
}
