package ch06;

public class ArrEx4 {

	public static void main(String[] args) {
		String[] arrStr = new String[5];
		System.out.println(arrStr[0]);		// arrStr[0] = null (O), arrStr[0] = "null" (X)
		
		String[] arrStr1 = {"�̼���", "ȫ�浿", "������"};
		System.out.println("arrStr1 �迭�� ���̴� " + arrStr1.length);  // 3
		
		for (int i = 0; i < arrStr1.length; i++) {		// �����迭�� �� ���
			System.out.println(arrStr1[i]);
		}
		
		int[] number = new int[100];		// 0���� �ʱ�ȭ
		// �迭������ ���� ����
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		for (int i = 0; i < number.length; i++) {		// �����迭�� �� ���
			System.out.println("number[" + i + "] : " + number[i]);
		}
	}

}
