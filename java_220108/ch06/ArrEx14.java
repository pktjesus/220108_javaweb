package ch06;

public class ArrEx14 {

	public static void main(String[] args) {
		// System.arraycopy ����Ͽ� �迭 ����
		// ���� �迭
		int[] arrInt = {1,2,3};
		
		// ������ �迭
		int[] arrInt2 = new int[5];

		// 0��° �Ķ���� : ���� ���� �迭
		// 1��° �Ķ���� : ���� ���� �迭�� ���� �ε��� ��
		// 2��° �Ķ���� : ������ ��� �迭
		// 3��° �Ķ���� : ������ ��� �迭�� ������ �ε��� ��
		// 4��° �Ķ���� : ���� ���� �迭���� ���� �ε��� �����κ��� ���� ������ �ε��� ����
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		
		// �迭 �� ���
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
