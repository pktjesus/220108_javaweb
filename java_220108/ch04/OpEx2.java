package ch04;

public class OpEx2 {

	public static void main(String[] args) {
		int a = 5 + 5;
		System.out.println("5 + 5 = "+a);	// 10���
		int b = a - 5;
		System.out.println("10 - 5 = "+b);	// 5���
		int c = b * 2;
		System.out.println("5 * 2 = "+c);	// 10���
		int d = c / 5;
		System.out.println("10 / 5 = "+d);	// 2���

		// ������ ����
		int e = 10 % 3;	// 10 ������ 3�� ������� ���� 3, ������ 1
		System.out.println("10 % 3 = "+e);
		
		int a1 = 10;
		int b1 = 4;
		System.out.println("10 / 4 = " + (a1 / b1));	   	 // 2.5�� �ƴ� 2 -> ������������ �������� ������
		System.out.println("10 / 4 = " + ((double)a1 / b1)); // 2.5 -> ��������ȯ
		
		double c1 = 10.0;
		double d1 = 4.0;
		System.out.println("10.0 / 4.0 = " + (c1 / d1)); // 2.5
		
		double e1 = 10.0;		// 10�� �Է��ص� ���� ��� -> �Ǽ����� ������������ ������ �Ǽ���
		int f1 = 4;
		System.out.println("10.0 / 4 = " + (e1 / f1)); // 2.5
		
		// https://toma0912.tistory.com/66 -> ����켱���� ǥ ����
		// (1 + (2 - (3 * 10))) / 5		// �Ұ�ȣ ��ȣ�� ����Ͽ� ��������� ��������
	}

}
