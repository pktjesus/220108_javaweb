package ch07.test.test2;

import ch07.ClassA;
import test1.test2.test3.TestPackage;

public class ClassC {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.print();		// public �޼ҵ忩�� ȣ���� ����. protected, private Ȥ�� default�� ���� ȣ�� �Ұ���
		
		//ClassB cb = new ClassB();	// �ٸ� ��Ű���� ������ ���������ڰ� default���� ��ü������ �Ұ���
		
		TestPackage tp = new TestPackage();
		tp.method();	// public���� ���� ����
		//tp.method1();	// private���� ����
		//tp.method2();	// protected���� ����
		//tp.method3();	// default���� ����
		
	}

}
