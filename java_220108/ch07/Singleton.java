package ch07;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	// �����ڿ� private���� �����ؼ� �ڱ� ���ο����� �����ڸ� ȣ���� �� �ֵ��� ���� 
	private Singleton() {
		System.out.println("��ü ����");
	}
	
	// public static �޼ҵ�
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}
}
