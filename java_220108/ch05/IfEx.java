package ch05;

public class IfEx {

	public static void main(String[] args) {
		int score = 55;

		System.out.println("���� ����");
		
		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		System.out.println();
		System.out.println(score >= 60 ? "�հ��Դϴ�" : "���հ��Դϴ�.");
		
		System.out.println("���� ��");
	}

}
