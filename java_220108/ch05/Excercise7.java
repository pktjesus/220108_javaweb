package ch05;

public class Excercise7 {

	public static void main(String[] args) {
		// �ֻ����� ���� 6�� ���ö����� ��� �ݺ��ؼ� ������, ���� 6�� ������ ���ݱ��� �ֻ����� ���� Ƚ������ ��� �ڵ� �ۼ�
		// while�� �ݺ�, �ֻ����� Math.random()���� �ۼ�
		// [���� ���]
		// (3)
		// (6)
		// �� �ֻ��� ���� Ƚ���� : 2ȸ
		int count = 0;
		for(;;) {
			int dice = (int)(Math.random() * 6) + 1;	// 1 ~ 6�� ����
			System.out.println("(" + dice + ")");
			count++;
			
			if (dice == 6) {
				break;
			}
		}
		System.out.println("�� �ֻ��� ���� Ƚ���� : " + count + "ȸ");
	}

}
