package ch06;

public class Exercise4 {

	public static void main(String[] args) {
		// �ϳ��� �迭�� 1���� 10���� 10���� ������ ����Ǿ� �ִ�. ������ ���� �ٸ� �迭�� �ش� �ε��� ����
		// �������� �����ϴ� �ڵ� �ۼ�
		// ��1) num1 = {1,2,3};
		//      num2 = {1,4,9};		
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[10]; // {0,0,0,0,0,0,0,0,0,0}

		// �ڵ� �ۼ�
		for (int i=0; i<num1.length; i++) {
			num2[i] = num1[i] * num1[i];
		}
		
		// num2 ���
		for (int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
		System.out.println();
		////////////////////////////////////////////////////////////////
		// �־��� �迭�� �׸񿡼� �ִ밪�� ���ϴ� �ڵ� �ۼ�(for�� ���)
		int max = 0;						// �޼ҵ念��(����)�� �޸𸮿� ����
		int[] array = {1, 5, 3, 8, 2};		// �������� �޸𸮿� ����
		
		// �ڵ� �ۼ�
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);		// max : 8
	}
}