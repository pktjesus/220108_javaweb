package ch05;

public class ContinueEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;			// �ݺ����� ���������� �̵�
			} else if (i == 7) {
				break;				// �ݺ����� ��������
			}
			System.out.println(i);
		}
	}

}
