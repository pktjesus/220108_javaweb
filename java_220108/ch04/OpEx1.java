package ch04;

public class OpEx1 {
	public static void main(String args[]) {	// �����Լ�(main)
		// 4.1 ���Կ���(=,+=,-=,*=,/=(��),%=(������))
		int a = 0;			// �����ʿ��� ���� �� ���� ����(�ݴ�� �Ұ���)
		a = 1;
		// 1 = a;			// ����1
		// 1 + a = 2;		// ����2
		a = 1 + 2;			// ����(3)
		a = a + 1;			// ����(4)
		
		int number1 = 10;
		number1 += 10; 		// number1 = number1 + 10;
		System.out.println("number1 : " + number1);		// number1 : 20
		int number2 = number1 % 3;		// ������ 2 ����
		System.out.println("number2 : " + number2);		// number2 : 2
	}
}