package ch08;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child();		// �θ� ��ü ���� �ڽ� ��ü ����
		child.print();		// 1 2 3
	}
}

class Parent {
	int number = 3;		// ����ʵ�
	
	Parent() {			// ������
		System.out.println("�θ� ��ü ����");
	}
	
	void test1() {
		
	}
}

class Child extends Parent {
	int number = 2;
	
	Child() {
		System.out.println("�ڽ� ��ü ����");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);			// �޼ҵ� �������� number
		System.out.println(this.number);	// �ڽ� ��ü�� number
		System.out.println(super.number);	// �θ� ��ü�� number
		super.test1();
	}
}