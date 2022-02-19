package ch15;

public class LambdaEx3 {

	public static void main(String[] args) {
//		LambdaInterface3 li3 = (String name) -> {
//			System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		};
		// �Ű������� 1���� ���� ��ȣ �� Ÿ���� ��������
//		LambdaInterface3 li3 = (String name) -> System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		LambdaInterface3 li3 = (name) -> System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		LambdaInterface3 li3 = name -> System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		LambdaInterface3 li3 = (name) -> {
//			System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		};
		LambdaInterface3 li3 = name -> {
			System.out.println("�� �̸��� "+name+"�Դϴ�.");
		};
		li3.print("ȫ�浿");	
	}

}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name);
}