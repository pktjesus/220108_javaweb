package ch09;

public class ComplexerMain2 {

	public static void main(String[] args) {
		Fax fax = new Fax() {
			// �������̽��� ��� �߻� �޼ҵ� ����
			@Override
			public void send(String tel) {
				System.out.println("����� �͸� ���� ��ü�� send() : tel -> " + tel);
			}

			@Override
			public void receive(String tel) {
				System.out.println("����� �͸� ���� ��ü�� receive() : tel -> " + tel);
			}
		};
		fax.send("1234");
		fax.receive("5678");
	}

}
