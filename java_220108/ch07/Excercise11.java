package ch07;

public class Excercise11 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		MathEx m = new MathEx();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}
}

// �޼ҵ�� max�� min�� ����� �ϴ� �ڵ� �ۼ�
// max : �Ű������� �Է¹��� �迭 �� �� �ִ밪�� ����, ���ϰ��� ����, �Ű������� ����Ÿ�� �迭
// min : �Ű������� �Է¹��� �迭 �� �� �ּҰ��� ����, ���ϰ��� ����, �Ű������� ����Ÿ�� �迭
class MathEx {
	int min(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
			}
		}
		
		return temp;
	}
	int max(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		
		return temp;
	}
}
