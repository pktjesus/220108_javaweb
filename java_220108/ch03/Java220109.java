package ch03;

// ���ȣ('[]')
// �߰�ȣ('{}')
// �Ұ�ȣ('()')

public class Java220109 {

	static int no;		// Java220109Ŭ���� ������ ��밡���� ����
	
	public static void main(String args[]) {	// �����Լ�(main)
		// 3.3 ����� ���ͷ�
		final double PI = 3.14; // final�� ��� ����
		// PI = 2.14;
		System.out.println("PI : " + PI);
		
		// 3.4 �����
		System.out.println("�ٹٲ�\n�ٹٲ�\t��\\\"\'");
		System.out.println("�׳�� ���ߴ�. \"���� �װ� ����\"");

		// 3.5 ������ ����(scope)
		String name = null;	// main�޼ҵ� �� ������ ��� ������ ����
		System.out.println("no : " + no + ", name : " + name);
		
		if(true) {
			name = "ȫ�浿";
			
			String email = "hong@test.com";
		}
		// email = "yuone@test.com";		        // ���� -> if�� ���� ������ �ٱ����� ����� �Ұ��� 
		System.out.println("name : " + name);
		// System.out.println("email : " + email); // ���� -> if�� ���� ������ �ٱ����� ����� �Ұ���
		
		// 3.6 ����ȯ(casting)
		// ������������ ����ȯ(�ڵ�����ȯ)
		int number1 = 10;
		long number2 = number1;			// �ڵ�����ȯ ���� int < long
		System.out.println("number2 : " + number2);
		long number3 = 1231312312312312312L;
		// int number4 = number3;		// �ڵ�����ȯ�� �Ұ� int < long

		// �������� �Ǽ������� ����ȯ(��������ȯ)
		double numeric1 = 5.5123;	
		int numeric2 = (int)numeric1;	// �Ҽ��� �����ڸ��� �� ����
		System.out.println("numeric2 : " + numeric2);	// 5
		double numeric3 = 5;
		int numeric4 = (int)numeric3;	// ���� �ս��� �߻����� ����
		System.out.println("numeric4 : " + numeric4);	// 5
		
		int numeric5 = 235;
		double numeric6 = numeric5;		// �ڵ�����ȯ
		System.out.println("numeric6 : " + numeric6);	// 235.0
		
		if(numeric5 == numeric6) {
			System.out.println("numeric5�� numeric6�� ����");
		} else {
			System.out.println("numeric5�� numeric6�� �ٸ���");
		}
	}
	
	
}
