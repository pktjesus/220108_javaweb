package ch07;

import test1.test2.test3.TestImport;	// �ٸ� ��Ű���� Ŭ�������� 1������ ������ �� 
import test1.test2.test3.*;				// �ٸ� ��Ű���� Ŭ�������� ������ ������ ��

public class TestPackage {

	public static void main(String[] args) {
		Member a;		// ���� ��Ű������ �ִ� Ŭ�������� import���� ��� ����
		test1.test2.test3.Member b;	// �ٸ� ��Ű���� �ִ� Ŭ������ import�� ����ϰų� ���� ��Ű������ �Է��Ͽ� ��밡��
		
		TestImport c = new TestImport();
		test1.test2.test3.TestImport d = new test1.test2.test3.TestImport();
		
		c.method();
		d.method();
		
		test1.test2.test3.TestPackage e = new test1.test2.test3.TestPackage();
		e.method();
	}
}
