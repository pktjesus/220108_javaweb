package ch05;

public class ForEx2 {

	public static void main(String[] args) {
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		
		int sum = i1 + i2 + i3;
		System.out.println("�հ� : " + sum);
		
		int sum1 = 0;	// �հ� ���� �ʱ�ȭ
		for (int i = 1; i <= 100; i++) {
			sum1 += i;  // sum1 = sum1 + i;		
		}
		
		System.out.println("�հ�1 : " + sum1);
	}

}
