package ch05;

public class Excercise7_2 {

	public static void main(String[] args) {
		// ���ѷ����� ����� 3���� ���
		// for(;;) { ���๮1; }
		// while(true) { ���๮1; }
		// do { ���๮1; } while(true)
		
		int test1 = 0;
		while(true) {
			System.out.println("test1�� �� : " + test1);
			if (test1 == 5) {
//				while (true) {
//					break;
//				}
				break;
			}
			test1++;
		}
		// while���� Math.random() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·�
		// ����ϰ� ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�
		// ���� ���� 5�� �Ǵ� ������ �� (1,4), (4,1), (2,3), (3,2)
		int count = 0;
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;	// 1 ~ 6�� ����
			int num2 = (int)(Math.random() * 6) + 1;	// 1 ~ 6�� ����
			System.out.println("(" + num1 + ", " + num2 + ")");
			count++;
			if (num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("�� 2���� �ֻ��� ���� Ƚ���� : " + count + "ȸ");
		
		System.out.println("���α׷� ��ħ");
	}

}
