package ch04;

public class OpEx7 {

	public static void main(String[] args) {
		// 4.7 ���׿���
		int score = 40;
		// score�������� 60�̻��̸� �հ� �ƴϸ� ���հ�
		String isPass = score >= 60 ? "�հ�" : "���հ�";
		System.out.println(isPass);		// ���հ�
		
		int score2 = 85;
		String result = (!(score2 > 90) ? "��" : "��");
		System.out.println(result);		// ��
		
		// 4.8 ���ڿ�����(concatenate)
		String name = "ȫ�浿";		// ���ڿ�
		System.out.println("�ȳ��ϼ��� " + name + "�Դϴ�."); // concatenate
		
		int height = 180;		// ����
		System.out.println("���� Ű�� " + height + "cm�Դϴ�."); // 180���ڸ� "180"���ڿ��� �ڵ�����ȯ
		
		// String weight = 75.5;		// ����
		String weight = 75.5 + "";	// 75.5���ڸ� "75.5"���ڿ��� �ڵ�����ȯ
		System.out.println("���� �����Դ� " + weight + "kg�Դϴ�.");
		
		int ageInt = 30; // ����(����)
		String ageStr = "30"; // ���ڿ�
	}

}
