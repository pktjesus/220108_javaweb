package ch05;

public class RandomEx {

	public static void main(String[] args) {
		// Random���� ���� ���
		// Math.random() -> 0.0 ~ 1.0 ������ ���� �������� ���
		System.out.println("���� ��1 : " + Math.random());
		System.out.println("���� ��2 : " + Math.random());
		System.out.println("���� ��3 : " + Math.random());
		System.out.println("���� ��4 : " + Math.random());
		
		// �Ҽ����� �ִ� �Ǽ��� �ƴ� ������ ��µǵ��� �ڵ� �ۼ�
		// 10 ~ 20 ������ ���� ���� ��µǵ��� �ڵ� �ۼ�
		int rnd1 = (int)(Math.random() * 10) + 10;		// 10 ~ 20
		System.out.println("���� ��5 : " + rnd1);
		// 12 ~ 18 ������ ���� ���� ��µǵ��� �ڵ� �ۼ�
		int rnd2 = (int)(Math.random() * 6) + 12;		// 12 ~ 18
		System.out.println("���� ��6 : " + rnd2);
		
	}

}
