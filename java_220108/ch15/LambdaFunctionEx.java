package ch15;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		// �Լ��� �������̽� ����
		//InterfaceEx ie = (int x, int y) -> x + y;		// sum�� ���� ����(�� �� �������� �߰�ȣ�� ������)
		InterfaceEx ie = (int x, int y) -> {	// �� ���̴��� �߰�ȣ�� ����ϰ� �Ǹ� return�� ����ؾ� ��	
			return x + y;
		};
		
		System.out.println(ie.sum(1, 2));
	}

}

interface InterfaceEx {
	public int sum(int x, int y);		// �������̽� �Լ��� ���� ����
}
