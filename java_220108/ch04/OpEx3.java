package ch04;

public class OpEx3 {
	public static void main(String[] args) {
		// 4.3 ��������
		int a = 0;
		int b = 0;
		
		++a;	// 1(��������) -> a = a + 1;
		b++;	// 1(��������) -> b = b + 1;
		
		System.out.println("a : " + a);		// 1
		System.out.println("b : " + b);		// 1
		
		int a1 = 10;
		int b1 = ++a1;		// 11(��������) -> a1 = a1 + 1; int b1 = a1;
		System.out.println("�������� ��� b1 : " + b1);	// 11
		System.out.println("�������� ��� a1 : " + a1);	// 11
		
		int x1 = 10;
		int y1 = x1++;		// 10(��������) -> int y1 = x1;  x1 = x1 + 1;
		System.out.println("�������� ��� y1 : " + y1);	// 10
		System.out.println("x1 : " + x1);			// 11
		
		// 4.4 �񱳿���
		System.out.println(1 == 1); 	// true
		System.out.println(1 != 1); 	// false
		System.out.println(1 > 1); 		// false
		System.out.println(1 < 1); 		// false
		System.out.println(1 >= 1); 	// true
		System.out.println(1 <= 1); 	// true
		
		// 4.5 ������(AND, OR, NOT, XOR)
		// AND : ��ΰ� �� �� ��쿡�� ��(&&)
		// OR : ���� 1���� ���� ��� ��(||)
		// NOT : �ݴ��� ��(!)
		// XOR : �� ���� ���� �ϳ��� �׸� ���� ��� ��(^)
		int a10 = 10;
		int b10 = 5;
		
		// AND ����
		System.out.println(a10 > b10 && a10 == 10);	// true
		System.out.println(a10 > b10 && a10 == b10);	// false
		
		// OR ����
		System.out.println(a10 > b10 || a10 == b10);	// true
		System.out.println(a10 < b10 || a10 == b10);	// false
		
		// XOR ����
		System.out.println(a10 > b10 ^ a10 == 10);	// false
		System.out.println(a10 > b10 ^ a10 == b10);		// true
		
		// NOT ����
		System.out.println(!(a10 > b10));	// false
		System.out.println(!(a10 < b10));	// true
		
		test();								// �޼ҵ� ����
		
		// &����
		System.out.println("&���� " + (a10 == b10 & test()));// ��1 & ��2 -> ��1�� ����� ��2�� ������ ������ ����(test1()�޼ҵ尡 ����)
		
		// &&����
		System.out.println("&&���� " + (a10 == b10 && test()));// ��1 && ��2 -> ��1�� ������ false�̸� ��2�� ������ �������� ����((test1()�޼ҵ尡 ����X)
		
		int op1 = 10;
		int op2 = 0;
		
		// int divideValue = op1 / op2;		// class���� compile(javac)�� ������ ����� ����(0 ������ ����)
	}
	
	public static boolean test() {			// �޼ҵ� ����
		System.out.println("test()�޼ҵ� ������ ��");
		return true;
	}
}
