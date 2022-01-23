package ch07;

public class LocalValExe {

	public static void main(String[] args) {
		Local local = new Local();
		System.out.println(local.name); // null
		
		local.process();
		System.out.println(local.name); // ȫ�浿
		
		local.printAge1();		// 20
		local.printAge2();		// 30
		
		// for�� ��� �������� ���� ����
		for (int i=0; i<10; i++) {
			int temp = 0;
			temp += i;
		}
		
		int temp = 1;
		System.out.println(temp); // 1
	}
}

class Local {
	String name;
	
	void process() {
		name = "ȫ�浿";
	}
	
	void printAge1() {
		int age = 20; // ��������
		//int age = 30; // error
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; // ��������
		System.out.println(age);
	}
}
