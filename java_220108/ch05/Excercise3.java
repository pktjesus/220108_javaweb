package ch05;

public class Excercise3 {

	public static void main(String[] args) {
		// �� ���� �ֻ����� �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ�
		for (int x = 1; x <= 6; x++) {
			for (int y = 1; y <= 6; y++) {
				// �ڵ� �ۼ�
				if(x + y == 6) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
