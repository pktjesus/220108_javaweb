package ch04;

public class Excercise3 {
	public static void main(String[] args) {
		// �ڵ� �ۼ�1(���� : 1�ٽ��� 12��)
		int colorPen = 5 * 12;		// 60
		int studentCount = 27;
		
		// �ڵ� �ۼ�2
		int divColorPen = colorPen / studentCount;
		System.out.println("�л��� ���������� �����ʼ� : " + divColorPen);
		
		// �ڵ� �ۼ�3
		int remainColorPen = colorPen % studentCount;
		System.out.println("�Ȱ��� ���������� ���� ����� : " + remainColorPen);
	}
}
