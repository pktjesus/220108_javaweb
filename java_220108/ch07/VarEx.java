package ch07;

public class VarEx {
	static int number;		// Ŭ���� ����(�������==�ʵ�)
	int number2;			// �ν��Ͻ� ����(�������==�ʵ�)
	
	public static void main(String[] args) {
		int number3; 		// ���� ����
		
		// Ŭ���� ���� ���
		System.out.println("Avante ������ : " + Avante.company);
		// System.out.println("Avante ���� : " + Avante.color);		// error
		
		Avante a1 = new Avante();
		a1.color = "ȭ��Ʈ";
		// �ν��Ͻ� ���� ���
		System.out.println("a1 ���� : " + a1.color);		
		
		// Ŭ���� ������ �ν��Ͻ� ��ü�� ���
		System.out.println("a1 ������ : " + a1.company);
		// Ŭ���� ������ �� ����
		a1.company = "���";
	
		// Ŭ���� ������ �� ���� �� Ŭ���������� �ν��Ͻ����� ���
		System.out.println("Avante ������ : " + Avante.company);
		System.out.println("a1 ������ : " + a1.company);
	}
}

class Avante {
	String color;		// �ν��Ͻ� ����
	static String company = "����";	// Ŭ��������
}