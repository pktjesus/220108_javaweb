package ch07;

public class FinalEx {
	public static void main(String[] args) {
		Final f = new Final();
		//f.number = 200;	// ���� -> final Ű���带 ����� ����ʵ� �����̱� ������
	}

}

class Final {
	final int number;
	
	Final() {
		number = 100;
	}
}