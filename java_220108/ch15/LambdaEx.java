package ch15;

public class LambdaEx {

	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String str = "�޼��� ���";
			System.out.println(str);
		};
		
		li.print();	
	}
}

interface LambdaInterface {
	void print();
	//void print2(); // �����߻� -> ���ٽ��� �������̽��� �޼��尡 2�� �̻��� ���� ����� �� ����
}