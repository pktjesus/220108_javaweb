package ch07;

public class Person {
	String name;	// �̸�
	String gender;	// ����
	int age;		// ����
	int height;		// Ű
	int weight;		// ������
	
	// Person��ü�� ������ �� name�� age�� �ʵ带 �ܺο��� ���� ������ �ʱ�ȭ�ϱ� ���� ������ �ڵ� �ۼ�
	// �⺻ �����ڵ� �ۼ�
	public Person() {
		
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public Person(int a, String n) {
		name = n;
		age = a;
	}
	
	public Person(int a) {
		age = a;
	}
	
	public Person(String n) {
		name = n;
	}
}
