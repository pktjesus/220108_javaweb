package chapter02;

public class HelloWorld { 	
	public static void main(String[] args) {		
		System.out.println("Hello World4");
		
		boolean a_;	// �ڷ��� ������;
		a_ = false;	// ���� = �ʱ�ȭ;
		int b = 0;	/// �ڷ��� ������ = �ʱ�ȭ;
		byte c = 127;
		
		int d1 = 0;
		int e = 0;
		int E = 0;
		
		int z = 0;
		int y = 0;
		int x = z + y;
		
		int leftNumber = 1;
		int left_number = 1;
		int rightNumber = 2;
		int twoNumberSum = leftNumber + rightNumber;
		int two_number_sum = leftNumber + rightNumber;
		
		char a = 'A';
		System.out.println("a:" + a);
		
		int bc = a;
		System.out.println("bc:" + bc);
		
		char ch1 = 66;
		System.out.println("ch1:" + ch1);
		
		int d2 = a + ch1;	// 65 + 66
		System.out.println("d2:" + d2);		// 131
		
		// char c1 = 'Hello';	// ����
		String str1 = "Hello";
		
		float f3 = 3.14151515f;		// float�� ��� f�� ������ �Է�
		double d3 = 3.14151515;		// double�� ��� d�� ���� ����
		
		System.out.println("float :" + f3);
		System.out.println("doulbe :" + d3);
		
		String name;		// ���� ����
		name = "ȫ�浿";		// ���� �ʱ�ȭ
		
		String name2 = "ȫ�浿";		// ���� ����� ���ÿ� �ʱ�ȭ
		String name3 = null;		// String name3;
		String name4 = "null";
		String name5 = "";
		
		System.out.println("name2 : " + name2);
		System.out.println("name3 : " + name3);
		System.out.println("name4 : " + name4);
		System.out.println("name5 : " + name5);
		
		String name6 = name2;
		System.out.println("name6 : " + name6);		// ȫ�浿
		name2 = "������";
		System.out.println("name6 : " + name6);		// ȫ�浿
		System.out.println("name2 : " + name2);		// ������
		
		String s10 = "1";
		String s11 = "1.5";
		String s12 = "true";
		
		System.out.println("s10 : " + s10);
		System.out.println("s11 : " + s11);
		System.out.println("s12 : " + s12);
		
		int i10 = 1;
		double d10 = 1.1;
		boolean b10 = true;
		
		System.out.println("i10 : " + i10);
		System.out.println("d10 : " + d10);
		System.out.println("b10 : " + b10);
		
		//int intTest1 = 4324324324324243243243243;
		String strTest1 = "4324324324324243243243243";
		
	}
}
