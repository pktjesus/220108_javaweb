package ch05;

public class Excercise1 {

	public static void main(String[] args) {
		int sum = 0;
		
		// for���� �̿��Ͽ� �ݺ� �հ� ����
		// 1���� 100���� �ݺ��ϸ鼭 5�� ����� �ջ�
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5�� ����� �հ�� " + sum);
		
		sum = 0;
		// 5���� 5�� ����
		for (int i = 5; i <= 100; i = i + 5) {
			sum += i;
		}
		System.out.println("5�� ����� �հ�� " + sum);
	}

}
