package ch07;

public class MethodStructure {
	// �޼ҵ� ����
	// ���������� ����Ÿ�� �޼����(�Ű�����...) {
	//    ���๮1;
	//    ���๮2;
	//    ���๮3;
	//    .
	//    .
	//    return ��;		// ����Ÿ���� void �϶��� ��������
	// }
	public static void test1(int param1, int param2) {
		System.out.println("param1 : " + param1);
		System.out.println("param2 : " + param2);
		System.out.println("test1 �޼ҵ� ����");
	} 
	
	static int test2(int param1) {
		System.out.println("param1 : " + param1);
		System.out.println("test2 �޼ҵ� ����");
		
		return param1;
	}
	
	public static void main(String args[]) {
		test1(1, 2);
		int test2ReturnValue = test2(3);
		
		System.out.println("test2ReturnValue : " + test2ReturnValue);
	}
}
