package ch06;

public class Lotto {

	public static void main(String[] args) {
		// �ζ� ��ȣ ���� ���α׷�
		// 1. �ζ� ��ȣ�� ��Ƶ� ���̰� 6���� ���� Ÿ���� �迭 ���� ����
		// 2. 1~45������ ��ȣ ���� ����
		// 3. ���࿡ �������� �߻���ȣ�� �迭�� �ִٸ� �ٽ� �����ϰ�, ���ٸ� �迭�� ���� ����
		// 4. �Ȱ��� ��ȣ�� ���� 6���� ��ȣ�� �� ������ ������ �ݺ��Ѵ�.
		// 5. �Ȱ��� ��ȣ�� ���� 6���� ��ȣ�� ����Ѵ�.
		
		int[] lotto = new int[6];		// �ζǹ�ȣ �ʱⰪ�� 0
		int idx = 0;
		while(true) {		// 2~4���� step
			int number = (int)(Math.random() * 45) + 1;	// 1 ~ 45��ȣ ���� �߻�
			
			boolean insert = true;
			for (int i = 0; i < idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
			if (insert) {
				lotto[idx] = number;
				idx++;
			}
			
			if (idx == 6) {
				break;
			}
		}
		// �ζǹ�ȣ ���
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
