package ch07;

public class MethodCall {

	public static void main(String[] args) {
		Method.printName();		// Ŭ������ ���� ����
		// m1.printName(); 	// ����� ���������� ����õ
		
		System.out.println();
		Method m1 = new Method();		
		m1.printEmail();		// ��ü�� �����ؼ� ����
	}
}

class Method {
	static void printName() {
		System.out.println("printName() ����");
	}
	
	void printEmail() {
		System.out.println("printEmail() ����");
		printId(); // �ٸ� �޼��� ����
	}
	
	void printId() {
		System.out.println("printId() ����");
	}
}
