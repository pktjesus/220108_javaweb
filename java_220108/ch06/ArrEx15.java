package ch06;

import java.util.Arrays;

public class ArrEx15 {

	public static void main(String[] args) {
		// Arrays ����Ͽ� �迭 ����
		// ���� �迭
		int[] arrInt = {1,2,3};
		
		// ������ �迭
		int[] arrInt2 = Arrays.copyOf(arrInt, 5);

		// �迭 �� ���
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
		
		int[] arr = {1,2,3};		
		//int arr[3];		// �迭 ��� ���� ����
		//int[] arr = new int[3];
		//int arr[3] = new int[3]; // �迭 ��� ���� ����
	}

}
