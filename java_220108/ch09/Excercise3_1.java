package ch09;

interface Action {
	void work();
}

public class Excercise3_1 {
	public static void main(String[] args) {
		// �͸� ���� ��ü �ڵ��ۼ�
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();
	}
}

// ��°�� ����
// -> ���縦 �մϴ�.
