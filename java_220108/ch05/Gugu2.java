package ch05;

public class Gugu2 {

	public static void main(String[] args) {
		// �Ʒ��� �������� �������� ��ø for���� ����Ͽ� �ڵ� �ۼ�
		// [���� ���]
		// [2��]
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// .
		// .
		// [3��]
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// .
		// .
		// [9��]
		// .
		// .
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "]��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
