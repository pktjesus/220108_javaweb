package ch05;

public class Excercise3_2 {

	public static void main(String[] args) {
		// ��ø for���� �̿��ؼ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x,y)���·� ����� ������.
		// ��, x�� y�� 10������ �ڿ����Դϴ�.
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				// �ڵ� �ۼ�
				if(((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
