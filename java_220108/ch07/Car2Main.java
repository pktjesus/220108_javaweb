package ch07;

public class Car2Main {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); // ������1 ȣ��
		Car2 c2 = new Car2("������"); // ������4 ȣ��
		Car2 c3 = new Car2("����", "������"); // ������3 ȣ��
		Car2 c4 = new Car2("black", "���", "ȭ����"); // ������2 ȣ��
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);	
	}
}
