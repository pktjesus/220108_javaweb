package ch05;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		// while������ 1���� 100������ �հ� ���ϴ� �ڵ� �ۼ�
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("�հ� : "+sum);
	}
}
