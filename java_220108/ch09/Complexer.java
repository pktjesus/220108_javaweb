package ch09;

// �������̽� ����
// public class ����Ŭ������ implements �������̽���1,�������̽���2... {
// // �������̽��� ��� �޼��� �ݵ�� ����
// }
public class Complexer implements Printer, Scanner, Fax {

	@Override		// @Override Ű����� �ɼǻ���
	public void print() {
		System.out.println("��� ����");
	}

	@Override
	public void scan() {
		System.out.println("��ĵ ����");
	}
	
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "���� " + tel + "�� FAX ����");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� " + FAX_NUMBER + "�� FAX ����");
	}
}
