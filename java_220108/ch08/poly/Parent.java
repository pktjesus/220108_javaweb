package ch08.poly;

public class Parent {
	String name;
	
	public static void main(String[] args) {
		int a = 10;
		double b = a;	// �ڵ�����ȯ(10 -> 10.0)
		
		double c = 10.5;
		//int d = c;		// ����(double�� int���� �� ũ�� ������ ������ ���� int�� double�� ������ �Ұ���)
		
		int d = (int)c;		// ��������ȯ�� ���� ������ ������ �ٿ� ������ ����
	}
	
	void walk() {
		System.out.println("�θ� �ȴ´�.");
	}
	void run() {
		System.out.println("�θ� �޸���.");
	}
}
