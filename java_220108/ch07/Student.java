package ch07;

public class Student {
	// �ʵ�
	String name; // �л���
	int grade; // �г�
	String department; // �а�
	
	// ������1
	Student(String n, int g, String d) {
		System.out.println("������1�� ����");
		name = n;
		grade = g;
		department = d;		
	}
	// ������2
	Student(String n, int g) {
		System.out.println("������2�� ����");
		name = n;
		grade = g;
	}
	// ������2-1
	Student(int n, int g) {
		System.out.println("������2�� ����");
		//name = n;
		grade = g;
	}	
	
	// ������3
	Student(String n) {
		System.out.println("������3�� ����");		
		name = n;
	}
	// ������4(�⺻ ������)
	Student() {
		System.out.println("������4(�⺻ ������) ����");		
	}
}
